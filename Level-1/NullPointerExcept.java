public class NulPointerException{

    public static void generateExcept() {

        String text = null;
        System.out.println(text.length());
    }

    public static void handleException() {

        String text = null;

        try {
            System.out.println(text.length());
        } catch (NullPointerException) {
            System.out.println("NullPointerExcept caught. Cannot call methods on a null reference.");
        }
    }

    public static void main(String[] args) {

        System.out.println("Generate NullPointerException:");

        try {
            generateException();
        } catch (NullPointerException) {
            System.out.println("Exception occurred while calling generateException().");
        }

        System.out.println("\nHandling NullPointerException using try-catch:");
        handleException();
    }
}
