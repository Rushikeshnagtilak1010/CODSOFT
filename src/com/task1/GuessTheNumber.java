package com.task1;

	import java.util.Random;

	import java.util.Scanner;

	public class GuessTheNumber {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Random random = new Random();
	        int winingRound= 0; 

	        System.out.println("Welcome to the My Guess the Number game..!");
            System.out.println("******************************************");
	        boolean playAgain;
	        do {
	            int randomNumber= random.nextInt(99) + 1;
	            int Countofattempts = 0;
	            int Attempts = 5;
	            boolean isGuessed = false;

	    		System.out.println("Pick a number,any number betwwen 1 to 100");
	            
	            while (Countofattempts< Attempts) {
	                System.out.print("Enter your Number: ");
	                int userGuess = sc.nextInt();
	                Countofattempts++;

	                if (userGuess == randomNumber) {
	                    System.out.println("Congratulations! You guessed the correct number.");
	                    winingRound++;
	                    isGuessed = true;
	                    break;
	                    
	                } else if (userGuess > randomNumber) {
	                    System.out.println("Too high!");
	                } else {
	                    System.out.println("Too low!");
	                }
	            }

	            if (!isGuessed) {
	                System.out.println("Sorry..! You used all your attempts. The correct number was: " + randomNumber);
	            }

	            System.out.println("Do you want to play again? (yes / no): ");
	            playAgain = sc.next().equalsIgnoreCase("yes");
	        } while (playAgain);

	        System.out.println("\nThank you for playing! Good luck!");
	        
	    }
	}

