import java.util.Scanner;
class Fizzbuzz{
	public static void main(String args[]){
		int num=20;
		if(num<0){
			System.out.println("invalid");
			return;
		}
		String result[]= new String[num];
		for(i=0;i<num;i++){
			if(i%3==0 & i%5==0){
				result[i-1]="FizzBuzz";
			}
			else if(i%3){
				result[i-1]="Fizz";
			}
			else if(i%5){
				result[i-1]="Buzz";
			}
		}
	}
}