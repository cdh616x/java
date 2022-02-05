import java.lang.Math;

import java.util.Scanner;

public class MethodPractice {
  static void timesTwo() {
    Scanner UserInput = new Scanner(System.in);
    System.out.print("What is the degrees in Centigrade? ");
    int celc = UserInput.nextInt();//input method .nextLine gives the entire character input from the user
    double product = (double)celc * (double)9 / 5 + 32;
    System.out.println(product);
  }
  public static void main(String[] args) {
    timesTwo();
  }
}
