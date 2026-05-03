package Genric.Bounded;
public class Runner{
    static void main(String[] args) {
        Student<String, Integer, Double> s1 = new Student<>("Ankush", 17, 72.9);
        System.out.println("Name: " + s1.name);
        System.out.println("Roll No: " + s1.rollNo);
        System.out.println("Marks: " + s1.marks);
    }
}
