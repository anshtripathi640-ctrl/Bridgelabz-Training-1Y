mport java.util.Scanner;
class ArrayMultiplicationTable{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int[] array_table = new int[11];
		System.out.print("Enter Number: ");
		int number = input.nextInt();
		for(int i=1;i<=10;i++){
			array_table[i] = number*i;
		}
		for(int i=1;i<array_table.length;i++){
			System.out.println(number + " X " + i + " = " + array_table[i]);
		}
	}
}
4th wala
import java.util.Scanner;
class ArraySumOfNumber{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		double[] array = new double[10];
		double sum = 0.0;
		int i=0;
		System.out.print("Enter Numbers: ");
		while(true){
			array[i]=input.nextDouble();
			if(array[i]<=0){
				break;
			}
			else if(i==9){
				break;
			}
			else{
				i++;
			}
		}
		System.out.print("Your Numbers are:\n");
		for(int j=0;j<array.length;j++){
			if(array[j]<=0){
				break;
			}
			System.out.println(array[j]);
			sum = sum + array[j];
		}
		System.out.println("The Sum is: " + sum);
	}
}
5th
import java.util.Scanner;
class MultiplicationTableFromSixToNine{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number From 6 To 9: ");
		int number = input.nextInt();
		if(number<=5){
			System.out.print("Invalid Response");
			return;
		}
		else if(10<=number){
			System.out.print("Invalid Response");
			return;
		}
		int[] multiplicationresult = new int[11];
		for(int i=1;i<=10;i++){
			multiplicationresult[i] = number*i;
		}
		for(int i=1;i<multiplicationresult.length;i++){
			System.out.println(number + " X " + i + " = " + multiplicationresult[i]);
		}
	}
}
6th wala
import java.util.Scanner;
class ArrayMeanHeight{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		double[] array_of_heights = new double[11];
		double sum = 0.0;
		System.out.print("Enter 11 Players Height: ");
		for(int i=0;i<array_of_heights.length;i++){
			array_of_heights[i] = input.nextDouble();
			if(array_of_heights[i]<=0){
				System.out.println("Invalid Height");
				return;
			}
			sum = sum + array_of_heights[i];
		}
		double mean = sum / array_of_heights.length;
		System.out.print("The Mean Height Of Players Are: " + mean);
	}
}
7th wala
import java.util.Scanner;
class ArrayEvenOdd{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int number = input.nextInt();
		if(number<=0){
			System.out.print("Error");
			return;
		}
		int size = number / 2 + 1;
		int[] array_even = new int[size];
		int[] array_odd = new int[size];
		int index_even=0, index_odd=0;
		for(int i=1;i<=number;i++){
			if(i % 2 == 0){
				array_even[index_even] = i;
				index_even++;
			}
			else{
				array_odd[index_odd] = i;
				index_odd++;
			}
		}
		System.out.println("Even Array: ");
		for(index_even=0;index_even<array_even.length;index_even++){
			if(array_even[index_even]==array_even[array_even.length-1]){
				break;
			}
			System.out.println(ar…
8th wala
import java.util.Scanner;
public class ArrayFactor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == maxFactor) {
                    maxFactor = maxFactor * 2;
                    int[] temp = new int[maxFactor];
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp;
                }
                factors[index] = i;
        …
9
import java.util.Scanner;
class OneToTwoArray{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Row: ");
		int row = input.nextInt();
		System.out.print("Enter Column: ");
		int column = input.nextInt();
		int[][] array2d = new int[row][column];
		int[] array1d = new int[row*column];
		int k=0;
		System.out.print("Enter Array:-\n");
		for(int i=0;i<array2d.length;i++){
			for(int j=0;j<array2d.length;j++){
				array2d[i][j]=input.nextInt();
				array1d[k++]=array2d[i][j];
			}
		}
		for( k=0;k	<array1d.length;k++){
			System.out.print(array1d[k] + " ");
		}
		
	}
}
10
import java.util.Scanner;
class ArrayFizzBuzz{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Your Number: ");
		int number = input.nextInt();
		if(number<0){
			System.out.print("Number Not Positive");
			return;
		}
		String[] fzbz = {"Fizz" , "Buzz" , "FizzBuzz" };
		for(int i=1;i<=number;i++){
			if(i%3==0 && i%5==0){
				System.out.println(fzbz[2]);
			}
			else if(i%3==0){
				System.out.println(fzbz[0]);
			}
			else if(i%5==0){
				System.out.println(fzbz[1]);
			}
			else{
				System.out.println(i);
			}
		}
	}
}