package Genric;
import java.util.*;
public class Runner extends Box2{
    static void main(String[] args) {
        Box2 b2 = new Box2();
        // BOOLEAN DATA TYPE
        b2.setRollNo(true);
        System.out.println(b2.getRollNo());
        // DECIMAL DATA TYPE
        b2.setRollNo(67.69);
        System.out.println(b2.getRollNo());
    }
}
