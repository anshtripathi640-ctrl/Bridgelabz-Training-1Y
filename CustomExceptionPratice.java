class InvalidAgeException1 extends Exception{
    public InvalidAgeException1(String message){
        super(message);
    }
}

public class CustomExceptionPratice{
    static void ageCheck(int a)throws InvalidAgeException1 {
        if (a < 18) {
            throw new InvalidAgeException1("INVALID AGE");

        }
        System.out.println("VALID AGE");
    }


    public static void main(String[]args) {
        try{
            ageCheck(18);
        }catch (InvalidAgeException1 e){
            System.out.println(e);
        }

    }
}