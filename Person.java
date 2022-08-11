import java.util.Scanner;
public class Person{
	//person attributes
	String name;
	public static int lastSocialNum = 1000;
	public int socialNum;
	int age;
	String gender;
	String address;
	String telephoneNum;
	static Scanner input = new Scanner(System.in);

	public void personInfo(String name, int age, String gender, String address, String telephoneNum){
		this.name = name;
		this.socialNum = lastSocialNum +1;
		lastSocialNum = lastSocialNum +1;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.telephoneNum = telephoneNum;

	}



	

}