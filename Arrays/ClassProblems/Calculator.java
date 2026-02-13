class Calculator{
	public int add(int a,int b){
		return a+b;
	}
	public int sub(int a,int b){
		return a-b;
	}
	public int div(int a,int b){
		return a/b;
	}
	public int mul(int a, int b){
		return a*b;
	}
	public static void main(String args[]){
		Calculator C1 = new Calculator();
		C1.add(10,20);
		int sum = C1.add(10,20);
		System.out.println(sum);
		int sub = C1.sub(20,10);
		System.out.println(sub);
		int div = C1.div(100,20);
		System.out.println(div);
		int mul = C1.mul(10,7);
		System.out.println(mul);
	}
}