
/**
 * 
 */
package add_game;
import java.util.Scanner;
/**
 * @author Travis
 *
 */
public class add_game {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello everyone.");
		System.out.println("Each of the following addition problems will be worth points.");
		System.out.println("The problems will get harder for each correct answer.");
		System.out.println("Get all of them correct for the best score.");
		//outline for add problem
		int score = 0 ;
		int hardness = 10;
		//round one
		//generate two random numbers		
		int number1 = (int)(Math.random() * hardness);
		int number2 = (int)(Math.random() * hardness);
		int correctAnswer = number1 * number2;	
		//ask the user to compute the numbers
		System.out.println("What is " + number1 + " * " + number2 + "?");
		//  Read in their response
		Scanner input = new Scanner(System.in);
		int studentAnswer = input.nextInt();
	    //  Check if the answer was correct
		// If Correct
		// Tell them it was correct
		// Give them points
		// Make the next question harder
		if(studentAnswer == correctAnswer){
		System.out.println("Answer correct.");
		score += hardness;
		System.out.println("Your score is now: " + score);
		hardness *= 10;
		System.out.println("So you think you're smart huh? Increase difficulty. LEVEL = " + hardness);
		// IF not correct
		//Tell them it was wrong
		//Tell them the correct answer
		}else{
		System.out.println("Haha you answered incorrectly");
		System.out.println("The correct answer is  " + correctAnswer);
		score += 0;
		System.out.println("Your score is now: " + score);
		// Make the next ? easier
		 if (hardness > 10){
		hardness /= 10;
		 }else{
		 System.out.println("I GUESS I will take it easy on you.");
		 System.out.println("LEVEL " + hardness);
		 //End of first round 
		 }
		 }
		//round two
		//generate two random numbers
		number1 = (int)(Math.random() * hardness);
		number2 = (int)(Math.random() * hardness);
		correctAnswer = number1 * number2;
		//ask the user to compute the numbers 
		System.out.println("What is " + number1 + " * " + number2 + "?");
		studentAnswer = input.nextInt();		
		if(studentAnswer == correctAnswer){
			System.out.println("Answer correct.");
			score += hardness;
			System.out.println("Your score is now: " + score);
			hardness *= 10;
			System.out.println("SO WHAT you still have two more rounds. LEVEL = " + hardness);	
			// IF not correct
			//Tell them it was wrong
			//Tell them the correct answer
		}else{
			System.out.println("Haha you answered incorrectly");
			System.out.println("The correct answer is  " + correctAnswer);
			score += 0;
			System.out.println("Your score is now: " + score);
			// Make the next ? easier
			 if (hardness > 10){
			hardness /= 10;
			 }else{
			 System.out.println("Come on it's just simple addition.");
			 System.out.println("LEVEL " + hardness);
			 //End of Round Two
			 }
			 }
			 //Round 3		 
			 number1 = (int)(Math.random() * hardness);
				number2 = (int)(Math.random() * hardness);
				correctAnswer = number1 * number2;
				//ask the user to compute the numbers 
				System.out.println("What is " + number1 + " * " + number2 + "?");
				studentAnswer = input.nextInt();
				
				if(studentAnswer == correctAnswer){
					System.out.println("Answer correct.");
					score += hardness;
					System.out.println("Your score is now: " + score);
					hardness *= 10;
					System.out.println("YOU HAVE NO CHANCE!!!!! LEVEL = " + hardness);	
					// IF not correct
					//Tell them it was wrong
					//Tell them the correct answer
				}else{
					System.out.println("Haha you answered incorrectly");
					System.out.println("The correct answer is  " + correctAnswer);
					score += 0;
					System.out.println("Your score is now: " + score);
					// Make the next ? easier
					 if (hardness > 10){
					hardness /= 10;
					 }else{
					 System.out.println("This is your last chance at some points.");
					 System.out.println("LEVEL " + hardness);
					 }
					 }
					 //End of Round 3	 
					 //Round 4
					 
					 number1 = (int)(Math.random() * hardness);
						number2 = (int)(Math.random() * hardness);
						correctAnswer = number1 + number2;
						//ask the user to compute the numbers 
						System.out.println("What is " + number1 + " + " + number2 + "?");
						studentAnswer = input.nextInt();					
						if(studentAnswer == correctAnswer){
							System.out.println("Answer correct.");
							score += hardness;
							System.out.println("Final Score: " + score);
							hardness *= 10;
							System.out.println("Thanks for playing!");
							// IF not correct
							//Tell them it was wrong
							//Tell them the correct answer
						}else{
							System.out.println("Haha you answered incorrectly");
							System.out.println("The correct answer is  " + correctAnswer);
							score += 0;
							System.out.println("Final Score: " + score);
							System.out.println("Thanks for playing!");
							// Make the next ? easier
							 if (hardness > 10){
							hardness /= 10;
					         }
				             }
							 }
							 }

					
					
					
