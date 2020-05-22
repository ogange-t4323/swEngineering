/**
 * 
 */
package maJavaProject;

import java.util.Scanner;

/**
 * @author tonny
 *
 */
public class myAppTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello there! Welcome to my application");
		System.out.println("Enter a number between 1 and 5 to know what animal you would be");
		Scanner input  = new Scanner(System.in);
		
		int n = input.nextInt();
		
		if(n==1) {
			System.out.println("you are a lion");
		}else if(n==2) {
			System.out.println("you are a rabbit");
		}else if(n==3) {
			System.out.println("you are a frog");

		}else if(n==4) {
			System.out.println("you are a lizard");
			
		}else if(n==5) {
			System.out.println("you are not an animal");
			
		}else{
			System.out.println("Invalid Entry!");
			
		}
		//this is the change to be tracked after commiting
		//to the smaller branch
		//lets see how it looks
		
	}

}
