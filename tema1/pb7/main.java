import java.util.Scanner;

public class main {
	public static int fib (int x) {
		int a = 1;
		int b = 1;
		int k = 3;
		while (k <= x) {
			int c = a + b;
			a = b;
			b = c;
			k++;
		}
		return b;
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		System.out.println(fib(n));
	}
}