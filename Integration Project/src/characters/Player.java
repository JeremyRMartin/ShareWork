package characters;

public class Player extends Person {

  ///////////////// Fields////////////////////////
  //all fields are defined in the parent class of "Person.java"

  ///////////////// Methods///////////////////////
  //// overloaded constructor////
  public Player(double health, boolean living) {
    super.setHealth(health);
    super.setLiving(living);
  }

//Overwritten Method
  @Override 
  public void speak(String dialog) {
    String whatToSay = dialog + " - [" + this.getName() + "]";
    System.out.printf("%77s", whatToSay);
    System.out.println();
    System.out.println();
  }// ends speak
}