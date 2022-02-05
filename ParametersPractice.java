import java.lang.Math;

import java.util.Scanner;

public class ParametersPractice {
  static void params(int num) {
    int x = num * 2;
    System.out.println(x);
  }
  public static void main(String[] args) {
  Scanner UserInput = new Scanner(System.in);
  System.out.print("What number would you like to double? ");
  int UserInputNum = UserInput.nextInt();//input method .nextLine gives the entire character input from the user
  params(UserInputNum);
}

}
