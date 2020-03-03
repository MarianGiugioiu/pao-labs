import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.print(i);
				System.out.print(" ");
			}
		}
	}
	
}