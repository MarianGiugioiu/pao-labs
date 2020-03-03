import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int a = keyboard.nextInt();
		int b = keyboard.nextInt();
		if (a >= b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}
}