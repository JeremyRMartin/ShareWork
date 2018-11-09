package tools;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import Storyline.Credits;
import characters.Person;

/*
 * "WAIT" CLASS DESCRIPTION: This tool is used to wait a certain amount of time before continuing.
 */
public class Wait {

  public static void threeDot() throws InterruptedException {// waits for 3 seconds and prints a dot
    for (int i = 0; i < 3; i++) {
      Wait.oneSecTrue();
      System.out.printf("%38s%n", ".");
    } // ends Loop
  }// ends threeDot

  public static void twoSec() throws InterruptedException {// waits for 2 seconds
    TimeUnit.SECONDS.sleep(2);
  }// ends twoSec
  
  public static void oneSecTrue() throws InterruptedException {// waits for 1 seconds indefinitely
    TimeUnit.SECONDS.sleep(1);
  }// ends twoSec

  public static void oneSecEventChance(Person Narrator) throws InterruptedException {// waits for 1 second based on cases
    Random rnd = new Random();
//    int dies = rnd.nextInt(100);
//    if (dies == 69) {
//      int times = rnd.nextInt(5)+7;
//      String[] s = {"*COUGH*", "*HACK*", "*WHEEZE*", "*HAAAACK*", "*WHEEEEEZE*"};
//      for (int i = 0; i < times; i++) {
//        TimeUnit.SECONDS.sleep(1);
//        int r = rnd.nextInt(s.length);
//        Narrator.speak(s[r]);      
//      } // ends Loop
//      TimeUnit.SECONDS.sleep(1);
//      Narrator.setLiving(false);
//      String NarDied = "***" + Narrator.getName().toUpperCase() + " HAS DIED***";
//      System.out.printf("%47s%n", NarDied);
//      Credits.rollFalseCredits();
//    }else {
      if (Narrator.getHasCoughDrops() == false) {// if the old man doesn't have cough drops he will
        int r = rnd.nextInt(10);               // cough often
        if (r != 1) {
          TimeUnit.SECONDS.sleep(1);
        } else {
          Narrator.cough();
        }
      } else {// if he does have them he wont cough as often
        int r = rnd.nextInt(300);
        if (r != 1) {
          TimeUnit.SECONDS.sleep(1);
        } else {
          Narrator.cough();
        }
//      } // ends Internal if else
    } // ends if else
  }// ends oneSec

  public static void sleep() throws InterruptedException {// player sleeps through the night
    for (int i = 0; i < 5; i++) {
      Wait.oneSecTrue();
      System.out.printf("%39s%n", "z");
    } // ends Loop
    Wait.oneSecTrue();
  }// ends sleep

}// ends wait class
