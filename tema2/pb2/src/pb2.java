import java.util.Scanner;

public class pb2 {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int n = scan.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int k=0, i=0, j=0;
        while(k < n){
            int a = scan.nextInt();
            if (a % 2 == 1){
                y[j++] = a;
            }
            else{
                x[i++] = a;
            }
            k++;
        }
        if (i >= j){
            System.out.println("X are mai multe elemente");
        } else {
            System.out.println("Y are mai multe elemente");
        }
    }
}

