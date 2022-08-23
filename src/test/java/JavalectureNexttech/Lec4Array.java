package JavalectureNexttech;

import java.util.Arrays;

public class Lec4Array {

	public static void main(String[] args) {
		// Array where we can store multiple values
		// datatype [] variable name={"value1","value2"...};
		//Array is fixed,we can't add or remove any data
		//In array we can exchange
		//To print array data we need to declare the array index Syntex 
		//System.out.println(variable[index value]);
String [] cars= {"Nissan","BMW","Toyota"};
String [] carFlowers= {"LILI","Rose","nightqueen","F4"};


int [] numbers= {1,2,3,4,5};

System.out.println(cars[0]);
System.out.println(carFlowers[2]);

//how to replace data on array
String [] cars1= {"Nissan","BMW","Toyota"};
cars1[0]="ford";
System.out.print(cars1[0]);

String [] Fruits1 = {"Mango", "Watermelon", "Orange", "Apple"};
Fruits1[0]="jackfruit";
System.out.println(Arrays.toString(Fruits1)); // full array printing


// Lenght of array syntex variable name.length
System.out.println(Fruits1.length);


// Array list= here we can store data as array but in array list its resizeable
//we can add, remove or replace





	}

}
