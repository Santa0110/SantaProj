package day1.one;

public class SimpleCalc {
	public int c;
	
	public void add(int a,int b) {
	c=a+b;
	System.out.println("Add "+c);
	}
	
	public void sub(int a, int b) {
		c=a-b;
		System.out.println("Sub "+c);
		}
	
	public void mul(int a, int b) {
		c=a*b;
		System.out.println("Mul "+c);
		
		}
	
	public void div(int a, int b) {
		c=a/b;
		System.out.println("Div "+c);
		}

}
