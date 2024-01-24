package javaPrograms;

public class duplicateinArray {

	public static void main (String [] args) {
		
		String names[] = {"Sankesh", "Naveen", "Shankar", "Rani", "Naveen"};
		
		for (int i=0; i < names.length; i++) {
			
			for (int j=i+1; j<names.length; j++) {
				
				if (names[i].equals(names[j])) {
					
					System.out.println("Duplicate element in the array is " + names[j]);
					System.out.println("Added new lines to check git new branch");
					System.out.println("These lines are added by the USA architect");
				}
				
			}	
			
		}
		
	}
	
}
