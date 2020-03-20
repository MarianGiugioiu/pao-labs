import java.util.Scanner;

public class pb3 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String s = scan.nextLine();
        int l = s.length()-1;
        if(s.charAt(0) == s.charAt(l-1) && s.charAt(1) == s.charAt(l)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
