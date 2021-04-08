package calculatrice;

public class Calculator {
	public int add(int a, int b) {
		return (a+b);
	}
	
	public int sub(int a ,int b) {
		return (a-b);
	}
	
	public int time(int a, int b) {
		return (a*b);
	}
	
	public boolean isEven(int a) {
		return ((a%2 == 0)? true:false);
	}
}
