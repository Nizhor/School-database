public class Employee extends Person{
    int department;
	String jobTitle;
	int yearHire;
    double hourlyRate;
	double hoursWorked;
	double unionDues;
    double salary;
	boolean professional;
	

    public Employee(String name,int age,String gender,String address,String  telephoneNum,int department,String jobTitle,int yearHire,double  salary){
		personInfo(name, age, gender, address, telephoneNum);
		employeeInfo(department,jobTitle,yearHire);
		this.salary = salary;
		this.professional = true;
		
	}

    public Employee(String name, int age,String gender,String address,String  telephoneNum,int department,String jobTitle,int yearHire,double  hourlyRate,double hoursWorked){
		personInfo(name, age, gender, address, telephoneNum);
		employeeInfo(department,jobTitle,yearHire);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
		this.professional = false;
		
	}

	public void employeeInfo(int department,String jobTitle,int yearHire){
		this.department = department;
		this.jobTitle = jobTitle;
		this.yearHire = yearHire;
	}


}