import java.util.Scanner;
class Height_conveter{
	public  static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your height (in cm):");
		double height_in_cm = sc.nextDouble();
		double height_in_feet = height_in_cm / 30;
		double height_in_inch = (height_in_feet * 12);
		System.out.println("your height in cm is " + height_in_cm + " while in feet is " + height_in_feet + " and inches is " + height_in_inch);
		System.out.println("your height in cm is " + height_in_cm + " while in feet is " + height_in_feet + " and inches is " + height_in_inch);
	}
}