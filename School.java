import java.util.Scanner;

public class School{
    static Scanner input = new Scanner(System.in);
    static String schoolName;
    public static void main(String[] args){

        System.out.println("Enter the school name: ");
        schoolName = input.nextLine();
        
        System.out.println("Welcome to "+ schoolName + ". We are going to build the population for " + schoolName + " with your help.");

        
        //change the main loop to something not trash
        int runMain = 1;
        while (runMain == 1){
            int studentsOrTeacher = mainScreen();
            //can return a 1 or 2






            if (studentsOrTeacher == 1){
                int studentScreen1 = screen2("student");
                // can return a 1,2,3, or 4
                if (studentScreen1 == 1){
                    int studentScreen2 = studentInfo();
                }
                else if (studentScreen1 == 2){}
                else if (studentScreen1 == 3){}
                
            }
            else{
                int employeeScreen1 = screen2("employee");
                // can return a 1,2,3, or 4
                if (employeeScreen1 == 1){
                    int employeeScreen2 = employeeInfo();
                }
                else if (employeeScreen1 == 2){}
                else if (employeeScreen1 == 3){}
            }
            
        }

        input.close();
    }

    public static int mainScreen(){

        int choice =0;

        while(choice != 1 && choice != 2){
            System.out.println("Whose information would you like to go through?");
            System.out.println("1.Students");
            System.out.println("2.Employees and Teachers");
            choice =input.nextInt();

        }

        return choice;
    }

    public static int screen2(String personType){

        int choice = 0;

        while(choice != 1 && choice != 2 && choice != 3){
            System.out.println("1.If you know the "+personType+"s ID number press 1.");
            //This will pull up the students information
            System.out.println("2.If you do not know the "+personType+"s ID number press 2.");
            //This will pull up a list of students first and last name followed by their ID number
            System.out.println("3.If you would like to add or remove a "+personType+" press 3.");
            System.out.println("4.If you would like to return to the previous menu press 4.");
    
            choice =input.nextInt();
            
            if(choice != 1 && choice != 2 && choice != 3 && choice != 4){
                System.out.println("you entered an invalid number. Try again.");
            }
        }

        return choice;

    }

    public static void idList(Object personType){
        System.out.println("print all the teachers names with their ids next to it");
    }

    public static int noPeople(String personType){
    
        int choice = 0;

        while(choice != 1 && choice != 2 && choice != 3 && choice != 4){
            System.out.println("You have no "+ personType+"s in your school!");
            System.out.println("1. Press 1 to add a " + personType);
            System.out.println("2. press 2 to return to the previous menu");
    
            choice =input.nextInt();
            
            if(choice != 1 && choice != 2){
                System.out.println("you entered an invalid number. Try again.");
            }
        }

        return choice;
    }

    public static int studentInfo(){
        
        int choice = 0;

        while(choice != 1 && choice != 2 && choice != 3 && choice != 4){
            System.out.println("1. Would you like to change the students personal information?");
            System.out.println("2. Would you like to change the students grades?");
            System.out.println("3. Would you like to change the students major?");
            System.out.println("4. Would you like to change the students graduation year?");
    
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
            System.out.println("1. Would you like to change the employees personal information?");
            System.out.println("2. Would you like to change the employees pay?");
            System.out.println("3. Would you like to change the employees department?");
            System.out.println("4. Would you like to change the employees job title?");
            System.out.println("5. Would you like to change the union dues?");
    
            choice =input.nextInt();
            
            if(choice != 1 && choice != 2 && choice != 3 && choice != 4){
                System.out.println("you entered an invalid number. Try again.");
            }
        }

        return choice;
    }

    




    
}