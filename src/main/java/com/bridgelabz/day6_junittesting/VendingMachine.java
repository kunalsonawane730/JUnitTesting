package com.bridgelabz.day6_junittesting;

import java.util.Scanner;

public class VendingMachine {
	 /**
     * Gets the change amount and finds the number of minimum Note needed to give the
     * change and also prints list of Rs Notes that would given in the Change.
     * @param changeAmount
     * @return minimumChangeNotes
     */
    public static int calculateChange(int changeAmount){

        int[] availableChangeNotes = new int[]{1,2,5,10,50,100,500,1000};

        int minimumChangeNotes = 0;
        int i,j;
        for(i = availableChangeNotes.length-1; i >= 0; i--){
        
            for(j = 0; changeAmount >= availableChangeNotes[i]; ){
                changeAmount = changeAmount - availableChangeNotes[i];
                minimumChangeNotes += 1;
                System.out.println(minimumChangeNotes);
                j=j+1;
            }
            if(j!=0){
                System.out.println("Number of Rs. " +availableChangeNotes[i]+ " notes: " + j);
            }
        }

        return minimumChangeNotes;
    }

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Enter a change amount: ");
        int changeAmount = input.nextInt();
        input.close();
        
        int minimumChangeNotes = calculateChange(changeAmount);
        
        System.out.println("Minimum Change Notes is: " + minimumChangeNotes);
         

	}

}
