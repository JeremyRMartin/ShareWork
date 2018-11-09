package tools;

import characters.Person;
import characters.Player;

/*
 * "TESTNAME" CLASS DESCRIPTION: This tool is used to test a users response to PLAYERNAME,
 * 
 * it will prompt asking for error in PLAYERNAME and return,
 * 
 * a CORRECTNAME.
 */

public class TestNameForCorrect {

  public static String CorrectName(String name, Person MainPlayer, Person Narrator)
      throws InterruptedException {
    name = FormatNameString.Format(name);
    MainPlayer.setName(name);
    Narrator.speak(MainPlayer.getName() + ", Really?");
    Wait.oneSecEventChance(Narrator);
    Narrator.speak("Did I get that right?");
    String response = RequestResponse.yesNo();
    boolean invalidInput = true;
    while (invalidInput) {
      if (response.equals("NO")) {
        System.out.println("[Old Man]- Okay, what is it then?");
        name = RequestResponse.askForString();
        invalidInput = false;
      } else if (response.equals("YES")) {
        invalidInput = false;
      } else {
        System.out.println("PLEASE ENTER A CORRECT OPTION");
        name = Utility.scanner.nextLine();
      }
    }
    name = FormatNameString.Format(name);
    MainPlayer.setName(name);
    return name;
  }
}
