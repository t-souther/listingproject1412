# FunFun With Loops and Methods
## Introduction
//This is a revised version of the addition game using loops and methods 
### Methods Used
//public static void main(String[] args)*
//public static void additionGameMethod()
//public static boolean getAndCheckStudentAnswer(int hardness)
## Outline
```// TODO Auto-generated method stub```
```//call the addition game method```
```//call the method to test```
```// Set up my for loop to go through the number of rounds```
```// Set up my for loop to go through the number of rounds```
```//set up print statements for if answer is correct and if answer is incorrect```
```//call new method getAndCheckStudentAnswer```
```//System.out.println("Inside get and check student answer method.");```
```//Scanner input = new Scanner(System.in);```
```//int studentAnswer = input.nextInt();```
```//Set up return True and Return False```
## Sources 
Liang, Y. (2013). Introduction to Java programming: Comprehensive version (nineth ed.).
## Code
``` java
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
		//set up print statements for if answer is correct and if answer is incorrect
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
		//call new method getAndCheckStudentAnswer	
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
```
## Console output
Answer the following questions.
Round 1 of 5. Add 0 and 0: 0
Correct. Your score was 0 and is now 1.
Your hardness was 1 and is now 2.
Round 2 of 5. Add 0 and 1: 1
Correct. Your score was 1 and is now 3.
Your hardness was 2 and is now 3.
Round 3 of 5. Add 2 and 2: 4
Correct. Your score was 3 and is now 6.
Your hardness was 3 and is now 4.
Round 4 of 5. Add 3 and 2: 5
Correct. Your score was 6 and is now 10.
Your hardness was 4 and is now 5.
Round 5 of 5. Add 0 and 3: 3
Correct. Your score was 10 and is now 15.
The game is complete.
Your final score was 15
Thanks For Playing!
## Command Prompt Output
Microsoft Windows [Version 10.0.10240]
(c) 2015 Microsoft Corporation. All rights reserved.

C:\Users\Travis>cd desktop

C:\Users\Travis\Desktop>cd computer_science

C:\Users\Travis\Desktop\computer_science>cd listingproject1412

C:\Users\Travis\Desktop\computer_science\listingproject1412>git add .

C:\Users\Travis\Desktop\computer_science\listingproject1412>git commit -m "adding funfun"
[master dcfa6a6] adding funfun
 5 files changed, 98 insertions(+), 6 deletions(-)
 create mode 100644 bin/listingproject1412/funfun.class
 rewrite bin/listingproject1412/listingproject1412.class (78%)
 delete mode 160000 listingproject1412
 create mode 100644 src/listingproject1412/funfun.java

C:\Users\Travis\Desktop\computer_science\listingproject1412>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

Username for 'https://github.com': t-souther
Password for 'https://t-souther@github.com':
Counting objects: 10, done.
Delta compression using up to 2 threads.
Compressing objects: 100% (8/8), done.
Writing objects: 100% (10/10), 3.56 KiB | 0 bytes/s, done.
Total 10 (delta 2), reused 0 (delta 0)
To https://github.com/t-souther/listingproject1412.git
   4c1a0f2..dcfa6a6  master -> master

C:\Users\Travis\Desktop\computer_science\listingproject1412>git pull
remote: Counting objects: 3, done.
remote: Compressing objects: 100% (3/3), done.
remote: Total 3 (delta 1), reused 0 (delta 0), pack-reused 0
Unpacking objects: 100% (3/3), done.
From https://github.com/t-souther/listingproject1412
   dcfa6a6..d174e64  master     -> origin/master
Updating dcfa6a6..d174e64
Fast-forward
 README.md | 257 +++++++++++++++++++++++++++-----------------------------------
 1 file changed, 111 insertions(+), 146 deletions(-)

## Summary
In this assignment I used for loops to rewrite the the addition game
