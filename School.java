import java.util.ArrayList;
import java.util.Scanner;

public class School{
    static Scanner input = new Scanner(System.in);
    static String schoolName;
    static ArrayList<Student> studentsList = new ArrayList<>();
    static ArrayList<Employee> employeesList = new ArrayList<>();
    public static void main(String[] args){

        System.out.println("Enter the school name: ");
        schoolName = input.nextLine();
        
        System.out.println("Welcome to "+ schoolName + ". We are going to build the population for " + schoolName + " with your help.");

        //change the main loop to something not trash
        int runMain = 1;
        while (runMain == 1){
            
            /*while (employeesList == null) {
                addEmployee()
            }
            */
            int studentsOrTeacher = mainScreen();
            
            //can return a 1 or 2 signifying either student or employee chosen
            if (studentsOrTeacher == 1){ //student was chosen
                while(studentsList. isEmpty()==true){
                    System.out.println("You dont have any students in your school!");
                    studentsList.add(addStudent());
                }
                int studentMainScreen = screen2("student");
                // can return a 1,2,3, or 4
                if (studentMainScreen == 1){//if you do know the students id was chosen
                    //int studentId = person.idchecker();
                    showAllStudentInfo();
                }
                else if (studentMainScreen == 2){//if you dont know the students id was chosen
                    displayStudents();
                }
                else if (studentMainScreen == 3){//if you would like to add or remove a student was chosen
                    System.out.println("Press 1 if you would like to add a new student");
                    System.out.println("Press 2 if you would like to remove a student");  
                    System.out.println("Press 3 if you would like to return to the last screen");

                    int addRemoveReturn = input.nextInt();

                    if(addRemoveReturn == 1){// this implies that they want to add a student
                        studentsList.add(addStudent());
                    }
                    else if(addRemoveReturn == 2){
                        removeStudent();
                    }

                }
                //note we still need to figure out option 4 which would return us to the previous menu
            }

            else{//employee was chosen
                
                while(employeesList. isEmpty()==true){
                    System.out.println("You dont have any employees in your school!");
                    employeesList.add(addEmployee());
                    
                }
                // can return a 1,2,3, or 4
                int employeeMainScreen = screen2("Employee");
                if (employeeMainScreen == 1){//if you do know the students id was chosen
                    //int studentId = person.idchecker();
                    showAllEmployeeInfo();
                }
                else if (employeeMainScreen == 2){//if you dont know the students id was chosen
                    displayStudents();
                }
                else if (employeeMainScreen == 3){//if you would like to add or remove a student was chosen
                    System.out.println("Press 1 if you would like to add a new employee");
                    System.out.println("Press 2 if you would like to remove a employee");  
                    System.out.println("Press 3 if you would like to return to the last screen");

                    int addRemoveReturn = input.nextInt();

                    if(addRemoveReturn == 1){// this implies that they want to add a student
                        
                        //ArrayList.add(addEmployee());
                    }
                    else if(addRemoveReturn == 2){
                        removeEmployee();
                    }
                }
            }

        }

        input.close();
    }

    public static int mainScreen(){

        int choice =0;

        while(choice != 1 && choice != 2){
            System.out.println("Whose information would you like to go through?");
            System.out.println("Press 1 for Students");
            System.out.println("Press 2 for Employees");
            choice =input.nextInt();

        }

        return choice;
    }

    public static int screen2(String personType){

        int choice = 0;

        while(choice != 1 && choice != 2 && choice != 3 && choice!=4){
            System.out.println("Press 1 If you know the "+personType+"s ID number");
            //This will pull up the students information
            System.out.println("Press 2 If you do not know the "+personType+"s ID number");
            //This will pull up a list of students first and last name followed by their ID number
            System.out.println("Press 3 If you would like to add or remove a "+personType);
            System.out.println("Press 4 If you would like to return to the previous menu");
    
            choice =input.nextInt();
            
            if(choice != 1 && choice != 2 && choice != 3 && choice != 4){
                System.out.println("You entered an invalid number. Try again.");
            }
        }

        return choice;

    }


    public static int studentInfo(){
        
        int choice = 0;

        while(choice != 1 && choice != 2 && choice != 3 && choice != 4){
            System.out.println("Press 1 if you would you like to change the students personal information?");
            System.out.println("Press 2 if you would you like to change the students grades?");
            System.out.println("Press 3 if you would you like to change the students major?");
            System.out.println("Press 4 if you Would you like to change the students graduation year?");
    
            choice =input.nextInt();
            
            if(choice != 1 && choice != 2 && choice != 3 && choice != 4){
                System.out.println("you entered an invalid number. Try again.");
            }
        }

        return choice;
    }

    public static int employeeInfo(){
        

        int choice = 0;

        while(choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5){
            System.out.println("Press 1 if you would you like to change the employees personal information?");
            System.out.println("Press 2 if you would you like to change the employees pay?");
            System.out.println("Press 3 if you would you like to change the employees department?");
            System.out.println("Press 4 if you would you like to change the employees job title?");
    
            choice =input.nextInt();
            
            if(choice != 1 && choice != 2 && choice != 3 && choice != 4){
                System.out.println("You entered an invalid number. Try again.");
            }
        }

        return choice;
    }

    public static Student addStudent( ){
        System.out.println("Enter the name of the new student");
        input.nextLine();
        String newName = input.nextLine();
        System.out.println("Enter "+newName+"s age");
        int age = input.nextInt();
        System.out.println("Enter "+newName +"s gender");
        input.nextLine();
        String gender = input.nextLine();
        System.out.println("Enter "+newName+"s address");
        String address = input.nextLine();
        System.out.println("Enter  "+ newName+"s telephone number");
		String telephoneNum = input.nextLine();
        System.out.println("Enter "+newName+"s GPA");
        double GPA = input.nextDouble();
        System.out.println("Enter "+newName+"s major");
        input.nextLine();
        String major = input.nextLine();
        System.out.println("Enter "+newName+"s year of graduation");
        int yearGraduation = input.nextInt();

		Student newStudent = new Student(newName, age, gender, address, telephoneNum, GPA, major, yearGraduation);
        return newStudent;
    }

    public static Employee addEmployee(){
        System.out.println("Enter the name of the new employee");
        input.nextLine();
        String newName = input.nextLine();
        System.out.println("Enter "+newName+"s age");
        int age = input.nextInt();
        System.out.println("Enter "+newName +"s gender");
        input.nextLine();
        String gender = input.nextLine();
        System.out.println("Enter "+newName+"s address");
        String address = input.nextLine();
        System.out.println("Enter  "+ newName+"s telephone number");
        input.nextLine();
		String telephoneNum = input.nextLine();
        System.out.println("Enter "+newName+"s department number");
        int department = input.nextInt();
        System.out.println("Enter "+newName+"s job title");
        String jobTitle = input.nextLine();
        System.out.println("Enter "+newName+"s year of hire");
        int yearHire = input.nextInt();

        System.out.println("Press 1 if  "+ newName+" is a full time worker" );
        System.out.println("Press 2 if  "+ newName+" is a part time worker" );

        int professional = input.nextInt();

        if(professional == 1){
            System.out.println("Enter "+newName+"s yearly salary");
            int salary = input.nextInt();
            Employee newEmployee = new Employee(newName, age, gender, address, telephoneNum, department, jobTitle, yearHire, salary);
            return newEmployee;
        }
        else if(professional ==2){
            System.out.println("Enter "+newName+"s hourly wage");
            int hourlyRate = input.nextInt();
            System.out.println("Enter "+newName+"s hours worked");
            int hoursWorked = input.nextInt();
            Employee newEmployee = new Employee(newName, age, gender, address, telephoneNum, department, jobTitle, yearHire, hourlyRate, hoursWorked);
            return newEmployee;
        }
        
        

        return addEmployee();
        
    }
    
    public static void removeStudent(){
        System.out.println("Enter the ID number of the person you'd like to remove from the school");
        int idNumber = input.nextInt();
        for (Student student : studentsList){
            if (student.socialNum == idNumber){
                System.out.println(student.name+" has been removed from the school");
                studentsList.remove(student);
                return;
            }
        }
        System.out.println("The number you entered did not return any person");
    }
    public static void removeEmployee(){
        System.out.println("Enter the ID number of the person you'd like to remove from the school");
        int idNumber = input.nextInt();
        for (Employee employee : employeesList){
            if (employee.socialNum == idNumber){
                System.out.println(employee.name+" has been removed from the school");
                employeesList.remove(employee);
                return;
            }
        }
        System.out.println("The number you entered did not return any person");
    }

    public static void displayEmployees(){
        for (Employee employee : employeesList){
            System.out.println();
            System.out.println(employee.name+" has the ID number "+employee.socialNum);
            System.out.println();
        }
    }
    
    public static void displayStudents(){
        for (Student student : studentsList){
            System.out.println();
            System.out.println(student.name+" has the ID number "+student.socialNum);
            System.out.println();
        }
    }

    public static void showAllStudentInfo(){
        System.out.println("Enter the ID number of the student whos info you would like to see");
        int idNumber = input.nextInt();
        for (Student student: studentsList ){
            if (student.socialNum == idNumber){
                System.out.println();
                System.out.println("Name: "+ student.name);
                System.out.println("ID number: "+ student.socialNum); 
                System.out.println("Age: "+student.age);
                System.out.println("Gender: "+student.gender);
                System.out.println("Address: "+student.address);
                System.out.println("Phone Number: " +student.telephoneNum);
                System.out.println("GPA: "+student.GPA);
                System.out.println("Major: "+student.major);
                System.out.println("Year of Gradutation: "+student.yearGraduation);
                System.out.println();
                return;
            }
        }
        System.out.println("The number you entered did not return any person");
    }

    public static void showAllEmployeeInfo(){
        System.out.println("Enter the ID number of the employee whos info you would like to see");
        int idNumber = input.nextInt();

        for (Employee employee: employeesList ){
            if (employee.socialNum == idNumber){
                System.out.println();
                System.out.println("Name: "+ employee.name);
                System.out.println("ID number: "+ employee.socialNum); 
                System.out.println("Age: "+employee.age);
                System.out.println("Gender: "+employee.gender);
                System.out.println("Address: "+employee.address);
                System.out.println("Phone Number: " +employee.telephoneNum);
                System.out.println("Department: "+employee.department);
                System.out.println("Job Title: "+employee.jobTitle);
                System.out.println("Year of Hire: "+employee.yearHire);
                try{
                    System.out.println("Salary: "+ employee.salary);
                }catch(Exception e){
                    System.out.println("Hourly Rate: "+ employee.salary);
                    System.out.println("Hours Worked: "+ employee.hoursWorked);
                }
                System.out.println("gotta fix prof and unprof");
                System.out.println();
                return;
            }
        }
        System.out.println("The number you entered did not return any person");
    }
    
}