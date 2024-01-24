package javaPrograms;

public class SmallesrorLargestinarray {
	
	public static void main (String [] args ) {
		
		int num[] = {1, 23, 545, 12, -9, 43, 2893};
		
		int Largest = 0;
		int Smallest = 0;
		
		for (int i=0; i< num.length; i++) {
			
			if (num[i] > Largest) {
				Largest = num[i];
			}
			
			else if (num [i] < Smallest) {
				Smallest = num[i];
			}
						
		}
		System.out.println(" Largest number in the array is "+ Largest);
		System.out.println(" Smallest number in the array is "+ Smallest);
		
	}

}
