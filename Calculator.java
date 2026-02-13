import java.util.*;
class Calculator{
	public int add(int num1,int num2)
	{
		return num1+num2;
	}
	public int sub(int num1,int num2)
	{
		return num1-num2;
	}
	public int mul(int num1,int num2)
	{
		return num1*num2;
	}
	public int div(int num1,int num2)
	{
		return num1/num2;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE FIRST NUMBER");
		int a=sc.nextInt();
		System.out.println("ENTER THE SECOND NUMBER");
		int b=sc.nextInt();
		Calculator c1 = new Calculator();
		System.out.println("enter choice");
		while(true){
		int choice=sc.nextInt();
		System.out.println("1: for addition");
		System.out.println("2: for subtraction");
		System.out.println("3: for multiplication");
		System.out.println("4: for division");
		switch(choice){
			case 1:int Addition=c1.add(a,b);
			       System.out.println("Addition of the following nos="+Addition);
			       break;
		  case 2:int Substraction=c1.sub(a,b);
		         System.out.println("Substraction of two numbers :- "+Substraction );
		           break;
		 case 3:int Multiplication=c1.mul(a,b);
		        System.out.println("Multiplication of two numbers :- "+Multiplication);
				  break;
		 case 4:int Division=c1.div(a,b);
		        System.out.println("Division of two numbers :- "+Division);
			     break;
		default : System.out.println("Invalid nos ");
		          break;
	}
	
}
	}
}