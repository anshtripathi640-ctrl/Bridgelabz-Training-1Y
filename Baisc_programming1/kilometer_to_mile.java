import java.util.*;
class kilometer_to_mile{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double miles;
		System.out.print("enter kilometer:");
		double kilometer=sc.nextDouble();
		System.out.print("in miles:");
		miles = kilometer *0.621371;
		System.out.println(miles);
	}
}