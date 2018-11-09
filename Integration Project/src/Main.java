import Storyline.Credits;
import Storyline.Intro;
import characters.Person;
import characters.Player;
import Storyline.Chapter1;
import tools.Utility;

public class Main {

  public static void main(String[] args) throws InterruptedException { 
    //POLYMOPRHISM
    //MainPlayer is a new Player being created of type Person.
    Person MainPlayer = new Player(100.0,true);
    Person Narrator = new Person("Old Man");
    boolean invalidInput = true;
    String menuSelection = Intro.printIntro(MainPlayer,Narrator); // returns "yes, no, how to play"
    while (invalidInput) {
      switch (menuSelection.toUpperCase()) {
        case "YES":
          Chapter1.section1(MainPlayer,Narrator);
          invalidInput = false;
          break;
        case "NO":
          Credits.rollFalseCredits();
          invalidInput = false;
          break;
        case "HOW TO PLAY":
          menuSelection = Intro.HowToPlay();
          break;
        default:
          System.out.println("PLEASE ENTER A CORRECT OPTION");
          menuSelection = Utility.scanner.nextLine();
      } // end switch conditional statement
    } // end while loop
  } // end main method
} // end Main class