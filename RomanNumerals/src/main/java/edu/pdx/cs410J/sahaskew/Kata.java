package edu.pdx.cs410J.sahaskew;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {
                                                                                    

  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
    System.exit(1);
  }

  public static String romanNumeralfor(int i) {
    if(i==1) {
      return "I";
    }
    else if(i==5){
      return "V";
    }
    return "empty";
  }


}