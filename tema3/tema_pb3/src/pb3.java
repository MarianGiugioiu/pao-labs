import java.util.Scanner;

public class pb3 {
    public static byte prim(int x){
        for (int d = 2; d*d <= x; d++){
            if(x % d == 0){
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] a = new int[n+1][m+1];
        byte[][] b = new byte[n+1][m+1];
        int k = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                a[i][j] = scanner.nextInt();
                b[i][j] = prim(a[i][j]);
                if(b[i][j] == 1){
                    k++;
                }
            }
        }
        System.out.println(k);
    }
}
