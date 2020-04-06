import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class pb1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileWriter out = new FileWriter("src/output.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(out);

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            try {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                if(a < b) {
                    bufferedWriter.write(String.valueOf(a) + " " + String.valueOf(b) + "\n");
                } else {
                    throw new Exception("Introduceti alta pereche de numere");
                }
            } catch (Exception e) {
                System.out.println(e.toString());
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                bufferedWriter.write(String.valueOf(a) + " " + String.valueOf(b) + "\n");
            }
        }
        bufferedWriter.close();
    }
}

