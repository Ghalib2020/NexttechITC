package JavalectureNexttech;

public class Lec6Accessmodifier {
	//public access modifier
	public int num1=20;//accessable from everywhere
	//default access modifier
	int num2=23;//only accessable from clases of same package
	//private 
	private int num3=40; //canot use outside of this class
	//how to create a method access modifierreturn type method_name(){}
	public void fbsignin() {
		System.out.println("Hi this is a public method");
		//block of code

		}
	//default method
	void fbaccount() {
		System.out.print("Hi this is default method");
	}
	
	private void fbsignup() {
		
		System.out.println("This is fbsignup");
		//block of code
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
String b="d";
//to create an object syntex classname objectname=new classname();
Lec6Accessmodifier myobj=new Lec6Accessmodifier();

System.out.println(myobj.num1);
System.out.println(myobj.num2);
System.out.println(myobj.num3);
myobj.fbsignin();
myobj.fbsignup();
Lec7inheritance myobj3=new Lec7inheritance();
myobj3.googlesignin();





	}

}
