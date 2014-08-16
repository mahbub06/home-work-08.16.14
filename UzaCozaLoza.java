package com.infix;

public class UzaCozaLoza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lowerbound = 1;
	      int upperbound = 110;
	      for (int number = lowerbound; number <= upperbound; ++number) {
	         // Print "Coza" if number is divisible by 3
	         if (number/3==0) {   
	            System.out.println("Coza");
	         }
	         // Print "Loza" if number is divisible by 5
	         if (number/5==0) {
	            System.out.println("Loza");
	         }
	         // Print "Woza" if number is divisible by 7
	         if (number/7==0) {
		            System.out.println("Woza");
		         }
	         
	         // Print a newline if number is divisible by 11; else print a space
	         if (number/11==0) {
	            System.out.println("divisible by 11");
	         }
	         
	         //else  {
	         if(number/3!=0&&number/5!=0&& number/7!=0){
	         
	         //if(number/3!=0)
	        	// if(number/5!=0)
	        		// if(number/7!=0){
	        	 System.out.print("Space");
	         }
	   }
	

	}

}
