import java.util.Scanner;

public class main {
	public static Boolean prim (int x) {
		for (int i = 2;i * i <= x ; i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		System.out.println(prim(n));
	}
}