import java.util.Scanner;
public class StringIndexOutOfBound{
    public static void generateException(String text) {
        System.out.println(text.charAt(text.length() + 1));
    }
    public static void handleException(String text) {
        System.out.println("Handling the exception using try-catch...");
        try {
            System.out.println(text.charAt(text.length() + 1));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught.");
            System.out.println("You cannot access index greater than or equal to the string length.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter strings: ");
        String inputText = scanner.next();
        System.out.println("\nFirst: Generating the exception");
        try {
            generateException(inputText);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurred during generating error.");
        }
        System.out.println("\nSecond: Demonstrate exception handling");
        handleException(inputText);
    }
}
