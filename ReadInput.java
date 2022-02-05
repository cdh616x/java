import java.util.Scanner;

public class ReadInput {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);//intstructs scanner to use terminal
    System.out.print("What is your name? ");
    String name = scanner.nextLine().trim();//input method .nextLine gives the entire character input from the user
    System.out.println(("Your name is: " + name).toUpperCase());
  }
}
