package tools;

import characters.Person;
import characters.Player;

/*
 * "STRINGRESPONSE" CLASS DESCRIPTION: This tool is used to request and return a response to an NPC.
 * 
 */


public class RequestResponse {


  public static String yesNoHowTo() {
    System.out
        .println(" ___________________________________________________________________________");
    System.out
        .println("|                                                                           |");
    System.out
        .println("|                          ***TYPE YOUR RESPONSE***                         |");
    System.out
        .println("|                           (YES)            (NO)                           |");
    System.out
        .println("|                               (HOW TO PLAY)                               |");
    System.out
        .println("|___________________________________________________________________________|");
    String response = Utility.scanner.nextLine();
    response = response.toUpperCase();
    return response;
  }// end yesNoMore method


  public static String yesNo() {
    System.out
        .println(" ___________________________________________________________________________");
    System.out
        .println("|                                                                           |");
    System.out
        .println("|                          ***TYPE YOUR RESPONSE***                         |");
    System.out
        .println("|                           (YES)            (NO)                           |");
    System.out
        .println("|___________________________________________________________________________|");

    String response = Utility.scanner.nextLine();
    response = response.toUpperCase();
    return response;

  }// end yesNo

  public static String askForString() {
    System.out
        .println(" ___________________________________________________________________________");
    System.out
        .println("|                                                                           |");
    System.out
        .println("|                          ***TYPE YOUR RESPONSE***                         |");
    System.out
        .println("|___________________________________________________________________________|");
    String response = Utility.scanner.nextLine();
    return response;
  }// end askForString

  public static String askForNameEntry(Person MainPlayer, Person Narrator)
      throws InterruptedException {
    System.out
        .println(" ___________________________________________________________________________");
    System.out
        .println("|                                                                           |");
    System.out
        .println("|                            ***TYPE YOUR NAME***                           |");
    System.out
        .println("|___________________________________________________________________________|");
    String nameEntry = Utility.scanner.nextLine();
    MainPlayer.setName(nameEntry);
    MainPlayer.setName(TestNameForCorrect.CorrectName(nameEntry, MainPlayer, Narrator));
    return nameEntry;
  }// end askForNameEntry

  public static int askForAge(Person MainPlayer) throws InterruptedException {
    System.out
        .println(" ___________________________________________________________________________");
    System.out
        .println("|                                                                           |");
    System.out
        .println("|                            ***TYPE YOUR AGE***                            |");
    System.out
        .println("|___________________________________________________________________________|");
    int response = Utility.scanner.nextInt();
    MainPlayer.setAge(response);
    return response;
  }// end askForInt

  public static void askForKarmaResult(Person MainPlayer, Person Narrator, KarmaOption[] karmaOptions) throws InterruptedException {
    System.out
        .println(" ___________________________________________________________________________");
    System.out
        .println("|                                                                           |");
    System.out
        .println("|                            ***PICK A NUMBER***                            |");
    System.out
        .println("|---------------------------------------------------------------------------|");
    for (int i = 0; i < karmaOptions.length; i++) {
      String Question = karmaOptions[i].getQuestion();
      int lengthOfQuestion = Question.length();
      int spacesToAdd = 70 - lengthOfQuestion;
      System.out.printf("|  " + (i + 1) + ". " + Question);
      for (int j = 0; j < spacesToAdd; j++) {
        System.out.printf(" ");
      }
      System.out.println("|");
    } // end Formatting
    System.out
        .println("|___________________________________________________________________________|");
    int response = Utility.scanner.nextInt();
    switch (response) {
      case 1:
        MainPlayer.setReputation(karmaOptions[0].getReputation());
        MainPlayer.speak(karmaOptions[0].getQuestion());
        Wait.oneSecEventChance(Narrator);
        Narrator.speak(karmaOptions[0].getReply());
        break;
      case 2:
        MainPlayer.setReputation(karmaOptions[1].getReputation());
        MainPlayer.speak(karmaOptions[1].getQuestion());
        Wait.oneSecEventChance(Narrator);
        Narrator.speak(karmaOptions[1].getReply());
        break;
      case 3:
        MainPlayer.setReputation(karmaOptions[2].getReputation());
        MainPlayer.speak(karmaOptions[2].getQuestion());
        Wait.oneSecEventChance(Narrator);
        Narrator.speak(karmaOptions[2].getReply());
        break;
      case 4:
        MainPlayer.setReputation(karmaOptions[3].getReputation());
        MainPlayer.speak(karmaOptions[3].getQuestion());
        Wait.oneSecEventChance(Narrator);
        Narrator.speak(karmaOptions[3].getReply());
        break;
      case 5:
        MainPlayer.setReputation(karmaOptions[4].getReputation());
        MainPlayer.speak(karmaOptions[4].getQuestion());
        Wait.oneSecEventChance(Narrator);
        Narrator.speak(karmaOptions[4].getReply());
        break;
    }
  }// end askForString

}
