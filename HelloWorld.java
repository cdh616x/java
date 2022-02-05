import java.util.Date;
import java.util.Arrays;

public class HelloWorld {
  public static void main(String[] args) {
    // int age = 30;
    // byte temp = 66;
    // float price = 10.99f;
    // char letter = 'A';
    // boolean isEligible = true;
    // System.out.println(age);//terminate statements with a semicolon
    // System.out.println(temp);
    // System.out.println(price);
    // System.out.println(letter);
    // System.out.println(isEligible);//all above types are primitive types
    Date now = new Date();
    String preamble = "This is the date: " + now;

    final float PI = 3.14f;//need the f on the end of the value / final inits a value as a constant (cannot be changed, used all capital letters for contants)

    int[][] numbers = {{1, 2, 3}, {4, 5, 6}};//IN JAVA ARRAYS HAVE A FIXED LENGTH

    System.out.println(preamble.toUpperCase());
    // Arrays.sort(numbers);
    System.out.println(Arrays.deepToString(numbers));//should return a string representation of the array / use deepToString to print multi dimensional arrays
    System.out.println(PI);
  }
}
