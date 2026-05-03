package Genric.Bounded;
public class Student <A, B, C>{
    A name;
    B rollNo;
    C marks;

    public Student(A name, B rollNo, C marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
}
