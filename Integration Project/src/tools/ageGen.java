package tools;

import java.util.Random;

public class ageGen {
 
  public static int randomAge() {
    Random rnd = new Random();
    int low = 85;
    int high = 300;
    int result = rnd.nextInt(high-low) + low;
    return result;
  }

}
