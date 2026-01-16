import java.util.Scanner;
class Harry{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your birth year:- ");
		int birth_year = sc.nextInt();
		System.out.print(2026 - birth_year);
	}
}