package javaPrograms;

public class reverseastring {

	public static void main (String []args ) {
		
		String str = "Selenium";
		
		int length = str.length();
		
		String Reversed= "";
		
		for (int i=length-1; i>=0; i--) {
			Reversed = Reversed + str.charAt(i);
		}
		System.out.println(Reversed);
		System.out.println("Reversed String Displayed here");
		System.out.println("Added new lines to check git new branch");
	}
}
