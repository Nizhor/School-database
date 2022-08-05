public class Student extends Person{
    double GPA;
	String major;
	int yearGraduation;

    public Student(String name, int age, String gender, String address, String telephoneNum,double GPA, String major, int yearGraduation){
		this.name = name;
		this.socialNum = lastSocialNum +1;
		lastSocialNum = lastSocialNum +1;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.telephoneNum = telephoneNum;
		this.GPA = GPA;
		this.major = major;
		this.yearGraduation = yearGraduation;
		
	}
}