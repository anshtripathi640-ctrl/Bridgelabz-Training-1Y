import java.util.Scanner;
class students{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of pens;");
		int pen = sc.nextInt();
		System.out.println("enter no of students:");
		int std = sc.nextInt();
		int rem= pen % std;
		int que = pen / std;
		System.out.print("the pen per students is "+ rem + "and the  remaining pen not distributed " +
		que);
		}
}