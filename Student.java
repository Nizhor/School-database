public class Student extends Person{
    double GPA;
	String major;
	int yearGraduation;

    public Student(String name, int age, String gender, String address, String telephoneNum,double GPA, String major, int yearGraduation){
		personInfo(name, age, gender, address, telephoneNum);
		this.GPA = GPA;
		this.major = major;
		this.yearGraduation = yearGraduation;
		
	}

	public Student(double GPA, String major, int yearGraduation){
		this.GPA = GPA;
		this.major = major;
		this.yearGraduation = yearGraduation;
		
	}
}