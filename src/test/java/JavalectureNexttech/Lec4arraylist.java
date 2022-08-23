package JavalectureNexttech;

import java.util.ArrayList;
import java.util.HashMap;



public class Lec4arraylist {

	public static void main(String[] args) {
		// Array list= here we can store data as array but in array list its resizeable
		//we can add, remove or replace
		//syntex ArrayList<datatype> variablename= new ArrayList<Datatype>();
		ArrayList<Integer> cars = new ArrayList<Integer>();
		ArrayList<String>flowers = new ArrayList<String>();
		// add data in arraylist syntex variablename.add=(data);
		
		flowers.add("rose");
		flowers.add("Lili");
		flowers.add("sunflower");
		flowers.add("blackrose");
		System.out.println(flowers); //print arraylist
		//flowers.get(0); //how to get value in arraylist
		System.out.println(flowers.get(0));
		
		//how to change item
		//Syntex name of variable.set(index,value);
		flowers.set(0, "F1");
		System.out.println(flowers);
		
		//Remove item in arraylist
		//syntex variablename.remove(index)
		flowers.remove(3);
		System.out.println(flowers);
		 //how to clear
		flowers.clear();
		System.out.println(flowers);
		
		//Size of arraylint
		flowers.size();
		System.out.println(flowers.size());
		 HashMap<String,String> Prac=new HashMap<String,String>();
		
		
		

	}

}
