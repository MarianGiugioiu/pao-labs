import java.util.Scanner;
import java.util.ArrayList;
public class pb2 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String s = scan.nextLine();
        StringBuffer S = new StringBuffer(s);
        StringBuffer T = new StringBuffer(s);
        S.reverse();
        if(S.toString().equals(T.toString())) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
