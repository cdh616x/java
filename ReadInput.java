import java.util.Scanner;

public class ReadInput {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);//intstructs scanner to use terminal
    System.out.print("Age: ");
    String age = scanner.nextLine().trim();//input method .nextLine gives the entire character input from the user
    System.out.println("You are: " + age);
  }
}
