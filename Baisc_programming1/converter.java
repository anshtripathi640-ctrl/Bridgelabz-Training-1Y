import java.util.Scanner;
class Converter{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your cost price:-");
		double cost_price=sc.nextDouble();
		System.out.print("enter your selling price:-");
		double selling_price=sc.nextDouble();
		double profit = selling_price - cost_price;
		double profit_percentage = (profit/cost_price)*100;
		System.out.print("Your profit Is:-" + profit);
		System.out.print("\nYour Profit percentage is:-" + profit_percentage);
	}
}