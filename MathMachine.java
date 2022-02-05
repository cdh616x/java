import java.util.Date;
import java.util.Arrays;

import java.lang.Math;//imported for Math.random()

public class MathMachine {
  public static void main(String[] args) {
    // normal operators, LOTS OF DIFFERENT WAYS TO OPERATE ON A VARIABLE, ***Remember PEMDAS***
    //Casting is changing types: implicit and explicit (can only occur between compatible types)
    double result = Math.floor(Math.random() * 100);//--------THIS IS AN EXPRESSION; AN EXPRESSION IS A PIECE OF CODE THAT PRODUCES A VALUE
    // float x = result + 15f;
    System.out.println(result);
  }
}
