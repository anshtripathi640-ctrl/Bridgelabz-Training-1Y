package Assignment14;

import java.util.Scanner;

public class Question1 {
    public void primitiveToWrapper(){
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();

        Integer num2=num1;
        System.out.println("Primitive DataType:"+num1);
        System.out.println("Object DataType:"+num2);
    }
    public static void main(){
        Question1 q1=new Question1();
        q1.primitiveToWrapper();

    }
}
