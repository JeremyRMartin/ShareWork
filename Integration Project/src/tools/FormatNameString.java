package tools;

public class FormatNameString {

  public static String Format(String UserInputedName) {// This is the header Format, and its being
                                                       // passed the arguments "UserInputedName"
    String badName = UserInputedName;
    badName = badName.trim();
    badName = badName.toLowerCase();
    char firstCharacter = badName.charAt(0);
    char fixedFirstCharacter = Character.toUpperCase(firstCharacter);
    String fixedName = fixedFirstCharacter + badName.substring(1);
    return fixedName;
  }
}
