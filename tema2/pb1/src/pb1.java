import java.sql.SQLOutput;
import java.util.Scanner;
public class pb1 {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int n = scan.nextInt();
        int[] v = new int[n];

        int x = scan.nextInt();
        int k=0;
        while(x != -1 && k < n){
            v[k++] = x;
            if(k<n)
                x = scan.nextInt();
        }
        int s = 0;
        for (int i = 0; i < k; i++) {
            s += v[i];
        }
        System.out.println((float)s/k);
    }
}

