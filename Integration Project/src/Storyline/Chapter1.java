package Storyline;


import tools.ageGen;
import characters.Person;
import characters.Player;
import tools.KarmaOption;
import tools.RequestResponse;
import tools.Utility;
import tools.Wait;

public class Chapter1 {

  public static void section1(Person MainPlayer, Person Narrator) throws InterruptedException {
    Narrator.speak("Okay good, why don't you get a bit more sleep and");
    Wait.oneSecEventChance(Narrator);
    Narrator.speak("we can pick up in the morning.");
    Wait.oneSecEventChance(Narrator);
    System.out.printf("%47s%n", "***YOU DOZE OFF***");
    Wait.sleep();
    System.out.printf("%47s%n", "***YOU WAKE UP***");
    Wait.twoSec();
    Narrator.speak("As, you can tell, I'm getting a bit older.");
    Narrator.cough();

    int oldManAge = ageGen.randomAge();
    Narrator.speak(oldManAge + " to be exact.");
    Wait.oneSecEventChance(Narrator);

    Narrator.speak("How old are you anyway?");
    int playersAge = Math.abs(RequestResponse.askForAge(MainPlayer));
    MainPlayer.setAge(playersAge);

    if (playersAge > oldManAge) {
      Narrator.setName("Young Man");
      Narrator.speak("Oof, maybe you should sit this one out so you don't break a bone.");
    } else if (playersAge < oldManAge) {
      Narrator.speak("Kids like you are much more limber than an old man like me.");
    } else {
      Narrator.setName("Same Aged Man");
      Narrator.speak("No Way! Twinsies!");
      Wait.oneSecEventChance(Narrator);
      Wait.oneSecEventChance(Narrator);
      Narrator.speak("*AHEM* Anywho.");
    } // ends if statement

    Wait.oneSecEventChance(Narrator);
     Narrator.speak("You dont happen to have any cough drops do you?");
     Utility.scanner.nextLine();
     String coughDrops = RequestResponse.yesNo();
     if (coughDrops.equals("YES")) {
       Narrator.setHasCoughDrops(true);
       Narrator.speak("Thanks.");
       Wait.oneSecEventChance(Narrator);
     } else if (coughDrops.equals("NO")) {
       Narrator.speak("Thanks anyway.");
       Wait.oneSecEventChance(Narrator);
     }// ends if statement
    Narrator.speak("Weird question, do you like me?");
    KarmaOption[] karmaOptions1 = new KarmaOption[5];
    karmaOptions1[0] = new KarmaOption("I \"like-like\" you, if you dig my vibe.", 30, "You're not to bad yourself.");
    karmaOptions1[1] = new KarmaOption("Sure, you seem okay.", 1, "*Giggles*");
    karmaOptions1[2] = new KarmaOption("...heh....", 0, "You're right that was weird, forget I asked.");
    karmaOptions1[3] = new KarmaOption("I literally just met you. WTF.",-1, "Yeah, you're right.");
    karmaOptions1[4] = new KarmaOption("Why dont you go and die already, just leave me alone.", -10, "*Sheds a single tear*");
    RequestResponse.askForKarmaResult(MainPlayer, Narrator, karmaOptions1);
    Wait.oneSecTrue();
    Narrator.speak("What about grapefruit? You like that stuff?");
    KarmaOption[] karmaOptions2 = new KarmaOption[5];
    karmaOptions2[0] = new KarmaOption("Yeah, and I'd love to \"grapefruit\" you!", 30, "Oh boy!");
    karmaOptions2[1] = new KarmaOption("I'd eat it if I had to.", 1, "Same.");
    karmaOptions2[2] = new KarmaOption("Grapefruit. It is a Fruit.", 0, "...Uh, That it is....");
    karmaOptions2[3] = new KarmaOption("Gross...", -4, "Oh, sorry I asked.");
    karmaOptions2[4] = new KarmaOption("I hope you choke on grapefruit! *BITCH-SLAP*.", -10, "OW! WHAT THE HECKERS!");
    RequestResponse.askForKarmaResult(MainPlayer, Narrator, karmaOptions2);
    Wait.oneSecTrue();
    System.out.println(MainPlayer.getKarma());


  }// ends section1

  public static void randomIntegrationWithNoUseYet() {

    // Random .equals and == (still need to have a purpose to implement one)..
    String stringOne = "This is String One.";
    String stringTwo = "This is String Two.";
    if (stringOne.equals(stringTwo)) {
      System.out.println("Interesting.");
    } else {
      System.out.println("Well, Duh they are two different Strings.");
    } // end if statement
    /*
     * if you were to use the "==" comparison operator then you would get an error, this does not
     * work for strings. What the "==" comparison operator does is compares two variables, and tests
     * if they point to the same location in memory.
     */

    // Random Ternary example(still need to have a purpose to implement one)
    int a = 50;
    int b = 51;
    int c = ++b;// this is a pre-increment meaning it will add one to b before saving the value to
                // c. (operator precedence)
    int minVal = a < b ? a : b;
    System.out.println(minVal);
    System.out.println("c will always be one more digit than b, see? " + b + " " + c);
  }// ends section2
}// ends chapter1
