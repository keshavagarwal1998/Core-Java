package com.keshav;


public class EvenNumberFinder {
	
	
	
	public static boolean findEven(int number) {
		
		if(number%2==0) {
			return true;
			}
		else {
			return false;
		}
		
	}
	
	public static void printEven() {
		int i;
		for(i=100;i>=1;i--) {
			
			if(i%2==0) {
				System.out.print(i);
				}
			else {
				System.out.print(" ");
			}
			
			
		}
	
	
	
	
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean ans=findEven(10);
		System.out.println(ans);
		
		printEven();
		
	}

}
