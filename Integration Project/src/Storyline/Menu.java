package Storyline;

import tools.RequestResponse;

public class Menu {
  public static String menuSelection() {
    System.out.println("Are you ready to play?");
    String response = RequestResponse.yesNoHowTo();
    return response;
  }
  
}
