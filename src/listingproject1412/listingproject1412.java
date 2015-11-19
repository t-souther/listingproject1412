/**
 * 
 */
package listingproject1412;

/**
 * @author Travis
 *## Introduction
 *##
 */
public class listingproject1412 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// 'A' is 65
		// 'B' is 90
		int startingValue = 65;
		int endingValue = 90-startingValue + 1;
		int randomNumber;
		randomNumber = (int)(startingValue + Math.random()*endingValue);
		//System.out.println(randomNumber);// debugging statment
		//Make new variable and then fill it with random number that is between our starting value and endingValue
		char letter = (char)randomNumber;
		System.out.println("The random uppercase letter is:"+letter);
		//System.out.println((char)(65+Math.random()*26)) ;
	}
	
	/*		
	 * a + Math.random()*b gives us a random numberbetween a and a+b excluding a+b
	 */




public static void gererateRandomLetter() {
	// 'A' is 65
	// 'B' is 90
	int startingValue = 65;
	int endingValue = 90-startingValue + 1;
	int randomNumber;
	randomNumber = (int)(startingValue + Math.random()*endingValue);
	//System.out.println(randomNumber);// debugging statment
	//Make new variable and then fill it with random number that is between our starting value and endingValue
	char letter = (char)randomNumber;
	System.out.println("The random uppercase letter is:"+letter);
	//System.out.println((char)(65+Math.random()*26)) ;
}
}
