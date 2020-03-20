import java.util.Scanner;

public class pb4 {
    public static boolean Check(String str){
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (!Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String s = scan.nextLine();
        if(Check(s)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
