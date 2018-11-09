package Storyline;

import characters.Person;
import characters.Player;
import tools.RequestResponse;
import tools.Wait;

/* "INTRO" CLASS DESCRIPTION:
 * Introduces player to the main story line,
 * and tests user for response to continue.
 * 
 * Also, Sets players name.
 * 
 */
public class Intro {
  public static String printIntro(Person MainPlayer, Person Narrator) throws InterruptedException {
    
    System.out.printf("%56s%n", "***YOU AWAKEN FROM BEING UNCONSCIOUS***");
    Wait.twoSec();
    System.out.printf("%60s%n", "***YOUR HEAD ACHES AND YOUR BODY FEELS HEAVY***");
    Wait.twoSec();
    System.out.printf("%70s%n",
        "***YOU CAN HEAR THE FAINT BREATHING OF SOMEONE HOVERED OVER YOU***");
    Wait.threeDot();
    Wait.oneSecTrue();
    System.out.printf("%50s%n", "***YOU OPEN YOUR EYES***");
    Wait.oneSecEventChance(Narrator);
    Narrator.speak( "Ahh, you\'re awake!");
    Wait.oneSecEventChance(Narrator);
    Narrator.speak("You withstood quite the beating back there.");
    Wait.twoSec();
    Narrator.speak("Hey, whats your name anyway?");
    RequestResponse.askForNameEntry(MainPlayer, Narrator);
    Narrator.speak("Okay " + MainPlayer.getName() + ", heres the sitch.");
    Wait.oneSecEventChance(Narrator);
    Narrator.speak("Look, I'm surprised you're even alive right now,");
    Wait.oneSecEventChance(Narrator);
    Narrator.speak("and I know it's probably inappropriate for me to ask a favor");
    Wait.oneSecEventChance(Narrator);
    Narrator.speak("from a half alive corpse, but we are desperate here.");
    Wait.oneSecTrue();
    Narrator.speak("Would you possibly be able to help us?");
    String response = RequestResponse.yesNoHowTo();
    return response;
  }// End printIntro method

  
  /* "MORE INFO" CLASS DESCRIPTION:
   * This class presents the user with more information about the INTRO,
   * 
   * And tests for response to continue.
   * 
   */

  public static String HowToPlay() throws InterruptedException {
    int i = 0;
    while (i < 12) {
      System.out.println();
      i++;
    }
    System.out.println(" ______________________________________________________________________");
    System.out.println("|                                                                      |");
    System.out.println("|                          ***HOW TO PLAY***                           |");
    System.out.println("|                                                                      |");
    System.out.println("|           This game is a Texted Based RPG game. The choices          |");
    System.out.println("|           that you make in the game will directly influence          |");
    System.out.println("|           the storyline that you receive. You will be tasked         |");
    System.out.println("|           with decisions, and specific choices... and those          |");
    System.out.println("|           decisions you make....ARE FINAL.                           |");
    System.out.println("|                                                                      |");
    System.out.println("|                            CHOOSE WISELY                             |");
    System.out.println("|                                                                      |");
    System.out.println("|______________________________________________________________________|");
    i = 0;
    while (i < 12) {
      System.out.println();
      i++;
    }
    Wait.oneSecTrue(); 
    System.out.println("Are you ready?");
    String response = RequestResponse.yesNo();
    return response;
  }// End moreInfo method



}// End Chapter1 class
