import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int a = keyboard.nextInt();
		int b = keyboard.nextInt();
		System.out.println((int)(Math.pow(a, b)));
	}
	
}