package JavalectureNexttech;

public class Lec2Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*if (condition)
{
block of cod	
}
else {
block of code
}*/

	int a=99;
	int b=1;
	if(a>b)	
	{
		System.out.println("value a is greater then  value b");
		
	}
	else {
		System.out.println("value a is less then value b");
	}
	//time
	int time=5;
	
	 if(7<time) 
	 {
		 System.out.println("good morning");
		 
	 }
	 else if (13<time) 
	 {
		 System.out.println("good noon"); 
	 }
	 else if(17<time)
	 {System.out.println("good afternoon");}
	 else {System.out.println("good night");}
	 
	 
	 // write a condition it daytime or its nighttim
	   
	
	 int t1=12;
	 if (t1<12) 
	 {
		 System.out.println("Its daytime");
		 
	 }
	 else if (t1==12) {
		 System.out.println("good noon");
	 }
	 else
	 {System.out.println("its Night time");}
	}

	
}

