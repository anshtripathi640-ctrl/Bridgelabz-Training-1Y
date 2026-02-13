import java.util.Scanner;
class PalindromeNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int temp=num;
		int rev=0;
		int rem=0;
		int a;
		while(temp!=0){
			rem=tem%10;
			rev=temp*10+rem;
			temp=temp/10;
		}
		if(rev=num){
			System.out.println("palindrome no");
		}
		else{
			System.out.println("not palindrome no");
		}
	}
}