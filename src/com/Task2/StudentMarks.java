package com.Task2;

import java.util.Scanner;

public class StudentMarks {
	public static void main(String[] args) {
		float totalMarks =0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numOfSub= sc.nextInt();
        
        System.out.println("*********************************");

        int[] marks = new int[numOfSub];

        for (int i = 0; i < numOfSub; i++) {
            System.out.print("Enter marks for subject " + (i+1) + ": ");
            marks[i] = sc.nextInt();
	}
        for (int i : marks) {
        	totalMarks+=i;
		} 
        System.out.println("*********************************");
        System.out.println("total marks of all subject:"+totalMarks);
         float percentage= totalMarks/numOfSub;
         System.out.println("percentage:"+percentage);
	 
         if (percentage >= 90) {
            System.out.println(" Grade :A+");
         } else if (percentage >= 80) {
        	 System.out.println(" Grade :A");
         } else if (percentage >= 70) {
        	 System.out.println(" Grade :B+");
         } else if (percentage >= 60) {
        	 System.out.println(" Grade :B");
         } else if (percentage >= 50) {
        	 System.out.println(" Grade :c");
         } else if(percentage >= 40) {
        	 System.out.println(" Grade :D");
         }
         else {
        	 System.err.println("failed");
         }
         System.out.println("*********************************");

	}
	
}