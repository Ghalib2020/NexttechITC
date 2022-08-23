package JavalectureNexttech;

public class Lec6accessmodifier2 {

	public static void main(String[] args) {
		// Access from other class
		
		Lec6Accessmodifier myobj=new Lec6Accessmodifier();
		//myobj.num1;
		//myobj.num2;
		System.out.println(myobj.num1);
		System.out.println(myobj.num2);
		myobj.fbsignin();
myobj.fbaccount();
	}

}
