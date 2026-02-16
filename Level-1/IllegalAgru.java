import java.util.Scanner;
class IllegalArgu{
    public static void generateException(String text) {
        System.out.println(text.substring(5, 2));
    }
    public static void handleException(String text) {
        System.out.println("Handling the exception using try-catch...");
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
            System.out.println("Start index cannot be greater than end index.");
        } catch (RuntimeException e) {
            System.out.println("runtime occurred.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.next();
        try {
            generateException(inputText);
        } catch (Exception e) {
            System.out.println("Exception generating the error.");
        }
        System.out.println();
        handleException(inputText);
    }
}
