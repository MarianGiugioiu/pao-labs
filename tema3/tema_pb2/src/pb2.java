import java.util.Scanner;

public class pb2 {
    public static boolean checkPalindrom(String s){
        StringBuffer S = new StringBuffer(s);
        StringBuffer T = new StringBuffer(s);
        S.reverse();
        if(S.toString().equals(T.toString())) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n = scan.nextInt();
        String[] a = new String[n+1];
        String[] b = new String[n+1];
        String x = "";
        int k = 0, M = 0;
        for (int i = 0; i <= n; i++){
            String S = scan.nextLine();
            a[i]=S;
        }
        for (int i = 0; i <= n; i++){
            String S = new String(a[i]);
            if(checkPalindrom(S)){
                b[k++] = S;
                if(S.length() > M){
                    M = S.length();
                    x = new String(S);
                }
            }
        }
        if(!x.equals("")) {
            System.out.println(x);
        } else {
            System.out.println("Nu exista palindroame");
        }
    }
}
