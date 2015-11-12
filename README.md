# listingproject1412
## Generate a random letter
### Java Code
``` Java
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
```
## Console output	 
	 The random uppercase letter is:N
## Command Prompt	 
1. Open Eclipse and start new project

2. Go to Github and start a new repository.

3. Use the command prompt to make the connections.

// 
C:\Users\Travis>cd desktop

C:\Users\Travis\Desktop>cd computer_science

C:\Users\Travis\Desktop\computer_science>cd listingproject1412

C:\Users\Travis\Desktop\computer_science\listingproject1412>git config user.name "t-souther"

C:\Users\Travis\Desktop\computer_science\listingproject1412>git config user.email tarvis-souther@hotmail.com

C:\Users\Travis\Desktop\computer_science\listingproject1412>git status
On branch master
Your branch is up-to-date with 'origin/master'.
Changes to be committed:
  (use "git reset HEAD <file>..." to unstage)

        modified:   bin/listingproject1412/listingproject1412.class
        modified:   src/listingproject1412/listingproject1412.java

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

        modified:   bin/listingproject1412/listingproject1412.class
        modified:   src/listingproject1412/listingproject1412.java


C:\Users\Travis\Desktop\computer_science\listingproject1412>git pull
remote: Counting objects: 7, done.
remote: Compressing objects: 100% (6/6), done.
remote: Total 7 (delta 0), reused 7 (delta 0), pack-reused 0
Unpacking objects: 100% (7/7), done.
From https://github.com/t-souther/listingproject1412
   72b3e28..587f56f  master     -> origin/master
Updating 72b3e28..587f56f
Fast-forward
 add_game.java      | 158 +++++++++++++++++++++++++++++++++++++++++++++++++++++
 listingproject1412 |   1 +
 2 files changed, 159 insertions(+)
 create mode 100644 add_game.java
 create mode 160000 listingproject1412

C:\Users\Travis\Desktop\computer_science\listingproject1412>git status
On branch master
Your branch is up-to-date with 'origin/master'.
Changes to be committed:
  (use "git reset HEAD <file>..." to unstage)

        modified:   bin/listingproject1412/listingproject1412.class
        modified:   src/listingproject1412/listingproject1412.java

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

        modified:   bin/listingproject1412/listingproject1412.class
        modified:   src/listingproject1412/listingproject1412.java

Untracked files:
  (use "git add <file>..." to include in what will be committed)

        bin/listingproject1412/funfun.class
        src/listingproject1412/funfun.java


C:\Users\Travis\Desktop\computer_science\listingproject1412>git add listingproject1412

C:\Users\Travis\Desktop\computer_science\listingproject1412>git commit -m "adding my listing project"
[master 996a1a6] adding my listing project
 2 files changed, 17 insertions(+), 2 deletions(-)

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
Counting objects: 8, done.
Delta compression using up to 2 threads.
Compressing objects: 100% (6/6), done.
Writing objects: 100% (8/8), 1.44 KiB | 0 bytes/s, done.
Total 8 (delta 1), reused 0 (delta 0)
To https://github.com/t-souther/listingproject1412.git
   587f56f..996a1a6  master -> master

C:\Users\Travis\Desktop\computer_science\listingproject1412>
	 
