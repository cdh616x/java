import java.lang.Math;

import java.util.Scanner;

public class MethodPractice {
  static void words() {
    Scanner UserInput = new Scanner(System.in);
    System.out.print("What is your number? ");
    int num1 = UserInput.nextByte();//input method .nextLine gives the entire character input from the user
    int product = num1 * 2;
    System.out.println(product);
  }
  public static void main(String[] args) {
    words();
  }
}
