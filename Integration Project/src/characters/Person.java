package characters;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Person {

  ///////////////// Fields////////////////////////

  private String name;
  private int age;
  private double health;
  private boolean living;
  private boolean hasCoughDrops = false;
  private int karma = 0;
/*
 * Inheritance is super helpful for an example with this class
 * being a parent class to the class Player.
 * 
 * It allows me to extend all the methods written here, and
 * apply them to the class player, this allows me to have any object
 * made of class player, to gain all of the methods available in Person.  
 * 
 */
  ///////////////// Methods///////////////////////

  //// overloaded constructor////
  public Person(String name) {
    this.name = name;
  }

  //// constructor////
  public Person() {}


  //// sets////
  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setHasCoughDrops(boolean hasCoughDrops) {
    this.hasCoughDrops = hasCoughDrops;
  }

  public void setHealth(double health) {
    this.health = health;
  }

  public void setLiving(Boolean living) {
    this.living = living;
  }

  public void setReputation(int karmaVal) {
    karma += karmaVal;
  }

  //// gets////
  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public boolean getHasCoughDrops() {
    return hasCoughDrops;
  }

  public double getHealth() {
    return health;
  }

  public boolean getLiving() {
    return living;
  }
  
  public int getKarma() {
    return karma;
  }

  public void speak(String dialog) {
    System.out.println("[" + name + "]- " + dialog);
  }// ends speak

  public void cough() throws InterruptedException {// cough sequence
    Random rnd = new Random();
    int times = rnd.nextInt(5)+1;
    String[] s = {"*COUGH*", "*HACK*", "*WHEEZE*", "*HAAAACK*", "*WHEEEEEZE*", "*HEP*", "*UCCCHHH*"};
    for (int i = 0; i < times; i++) {
      TimeUnit.SECONDS.sleep(1);
      int r = rnd.nextInt(s.length);
      this.speak(s[r]);      
    } // ends Loop
    TimeUnit.SECONDS.sleep(1);
  }
}// ends Character Class
