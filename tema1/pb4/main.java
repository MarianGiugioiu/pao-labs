import java.util.Scanner;

public class main {
	public static int factorial (int x) {
		int y = 1;
		for (int i = 1;i <= x ; i++) {
			y *= i;
		}
		return y;
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		System.out.println(factorial(n));
	}
	
}
