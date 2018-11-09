package Storyline;

import tools.Wait;

/* "CREDITS" CLASS DESCRIPTION:
 * This class is to run a CREDITS sequence when the user says no to 
 * INTRO's response request of "continue?".
 */
public class Credits {

  public static void rollFalseCredits() throws InterruptedException {
    System.out.printf("%58s%n", "******************THE END******************");
    System.out.printf("%58s%n", "******************CREDITS******************");
    String jobRoles[] = {"Producer: Jeremy Martin", 
        "Production Assistant: Jeremy Martin",
        "Development: Jeremy Martin", 
        "Developmental Assitant: Jeremy Martin",
        "StoryLine: Jeremy Martin", 
        "Senior Coffee Fetcher: Jeremy Martin",
        "Assistant Coffee Fetcher: Jeremy Martin", 
        "Dog Walker: Jeremy Martin",
        "Assitant TO the Dog Walker: Jeremy Martin"};
    
    for (int i = 0; i < jobRoles.length; i++) {
      Wait.twoSec();
      System.out.println();
      System.out.printf("%53s%n", jobRoles[i]);
    } // ends Loop
    System.out.printf("%58s%n", "******************FIN******************");
    Wait.oneSecTrue();
  }// ends Credits
}
