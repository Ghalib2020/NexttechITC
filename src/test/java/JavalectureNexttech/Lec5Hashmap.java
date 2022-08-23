package JavalectureNexttech;

import java.util.HashMap;

public class Lec5Hashmap {

	public static void main(String[] args) {
		// Hash map
		//syntex to declare hashmap HashMap<datatype,datatype> Variable name=new HashMap<datatype,datatype>();
		//syntex for adding key and value to hashmap variablename.put(key,value);

		
		HashMap<String,String> marks=new HashMap<String,String>();// syntex for hashmap
		marks.put("Adil", "80");// syntex for adding in hashmap
		marks.put("Rahil", "56");
		marks.put("reo", "76");
		marks.remove("Adil"); //syntex for remove any value
		
		System.out.println(marks);
		marks.get("Adil");
		System.out.println(marks.get("Adil"));
		System.out.println(marks.size());
		 
	}

}
