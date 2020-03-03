import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		for (int i = 0; i <=n; i+=2) {
			System.out.print(i);
			System.out.print(" ");
		}
	}
}
