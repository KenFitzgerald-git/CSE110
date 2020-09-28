import java.util.Scanner;

/* Author: Ken Fitzgerald
 * Filename: Scanner Project - Lab 1
 * Specification: First lab project
 * For: CSE 110- Lab #1
 * Time Spent: about 30 minutes
 */
public class LabOne {
	public static void main(String[] args){
	//declare three integers
	int score1, score2, score3; //4, 64, 54
	
	//constant integer
	final int NUM_TESTS = 3;
	
	//declare double
	double average; //34.5345
	
	//initialize the object
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the score on the first test: ");
	 score1 = input.nextInt();
	 
	System.out.println("Enter the score on the second test: ");
	 score2 = input.nextInt();
	 
	System.out.println("Enter the score on the third test: ");
	 score3 = input.nextInt();
	 
	average = (score1 + score2 + score3) / (double) NUM_TESTS;
	System.out.println("Your average score is: " + average);
	System.out.println("Program Ends");
	 
	
	}
	

}
		
	
