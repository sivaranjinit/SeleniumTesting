package week1.day2;

public class Calculator {
	public void add(int a,int b) { 
		System.out.println(a+b);
		}
	public void sub(int a,int b)
	{ 
		System.out.println(a-b);
	}
	public void mul(int a,int b)
	{
		System.out.println(a*b);
	}
	public void div(int a,int b) {
		System.out.println(a/b);
	}
	public static void main(String[] args) {
		Calculator obj = new Calculator();
		obj.add(10, 5);
		obj.sub(10, 5);
		obj.mul(10, 5);
	    obj.div(10, 5);

	}

}
