public class Employee extends Person{
    int department;
	String jobTitle;
	int yearHire;
    double hourlyRate;
	double hoursWorked;
	double unionDues;
    double salary;
	

    public Employee(String name,int age,String gender,String address,String  telephoneNum,int department,String jobTitle,int yearHire,double  salary){
		this.name = name;
		this.socialNum = lastSocialNum +1;
		lastSocialNum = lastSocialNum +1;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.telephoneNum = telephoneNum;
		this.department = department;
		this.jobTitle = jobTitle;
		this.yearHire = yearHire;
		this.salary = salary;
		
	}

    public Employee(String name, int age,String gender,String address,String  telephoneNum,int department,String jobTitle,int yearHire,double  hourlyRate,double hoursWorked,double unionDues){
		this.name = name;
		this.socialNum = lastSocialNum +1;
		lastSocialNum = lastSocialNum +1;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.telephoneNum = telephoneNum;
		this.department = department;
		this.jobTitle = jobTitle;
		this.yearHire = yearHire;
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
		this.unionDues = unionDues;
		
	}


}