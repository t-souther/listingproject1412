
package listingproject1412;
import java.util.Scanner;

public class funfun {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		additionGameMethod();
		//call the addition game method
		//call the method to test
		
		System.out.println("Thanks For Playing!");
		
	}
		public static void additionGameMethod() {
		System.out.println("Answer the following questions.");
		int hardness = 1;
		int hardnessStep = 1;
		int score = 0;
		
		// Set up my for loop to go through the number of rounds
		
		int numberOfRounds = 5;
		
		for(int  roundNumber = 1;
				roundNumber <= numberOfRounds;
				roundNumber = roundNumber + 1 ){
			System.out.print("Round " + roundNumber + " of " + numberOfRounds + ". ");
			boolean isAnswerCorrect1 = getAndCheckStudentAnswer(hardness);
			if(isAnswerCorrect1){
				System.out.print("Your score was " + score + " and is now ");
				score = score + hardness;
				System.out.println(score + ".");
				if(roundNumber<numberOfRounds){
					System.out.print("Your hardness was " + hardness + " and is now ");
					hardness = hardness + hardnessStep;
					System.out.println(hardness + ".");
				}
			}else{
				if(roundNumber>numberOfRounds){
					System.out.print("Your hardness was " + hardness + " and is now ");
					if(hardness>5){
						hardness = hardness / hardnessStep;
						
					}
					System.out.println(hardness + ".");
				}
				
			}
		}
		System.out.println("The game is complete.");
		System.out.println("Your final score was " + score );
		}	
			
		public static boolean getAndCheckStudentAnswer(int hardness) {
			//System.out.println("Inside get and check student answer method.");
			int number1 = (int)(Math.random()*hardness);
			int number2 = (int)(Math.random()*hardness);
			System.out.print("Add " + number1 + " and " + number2 +": ");
			//Scanner input = new Scanner(System.in);
			//int studentAnswer = input.nextInt();
			Scanner get = new Scanner(System.in);
			int studentAnswer = get.nextInt();
			if(studentAnswer == (number1 + number2)){
				System.out.print("Correct. ");
				return true;
			}else{
				System.out.println("Nice try, but the correct answer was " 
						+ (number1 + number2) + ".");
				return false;
			}
		}
	}
