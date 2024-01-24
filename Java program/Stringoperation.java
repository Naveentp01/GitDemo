package javaPrograms;

public class Stringoperation {

	public static void main (String [] args) {
		String Demo = "Demo";
		 String str = "The Rain is coming here"; // Defining the string S should be capital 
		 System.out.println(str.length()); // To get length of the string 
		 System.out.println(str.charAt(5)); // a -- To get a character at specific location
		System.out.println(str.indexOf('o')); // 
		System.out.println(str.indexOf('h', str.indexOf('h')+1));
		System.out.println(str.contains("isa"));
		System.out.println(str.concat(Demo));
		System.out.println(str.isEmpty());
		System.out.println(str.equalsIgnoreCase(Demo));
		System.out.println(str.replace('i', 'I'));
		System.out.println(str.toLowerCase());
		System.out.println(str.substring(0, 10));
		System.out.println("String operation is completed");
	}
}
