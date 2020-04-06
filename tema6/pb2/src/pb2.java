import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class pb2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        boolean corect = false;
        for (int i = 0; i < 5; i++) {
            FileInputStream fileInputStream = new FileInputStream("src/parole.txt");
            String username = scanner.nextLine();
            String password = scanner.nextLine();
            int incercariParola = 0;
            String string = checkLogin(fileInputStream, username, password);
            while (string.equals("Parola gresita")) {
                incercariParola ++;
                if (incercariParola == 3) {
                    System.out.println("Cont blocat.");
                    break;
                } else {
                    System.out.println("Parola gresita");
                    password = scanner.nextLine();
                    fileInputStream = new FileInputStream("src/parole.txt");
                    string = checkLogin(fileInputStream, username, password);
                }
            }
            if (string.equals("Corect")) {
                corect = true;
                System.out.println("Acces permis");
            }
        }
        if(!corect) {
            System.out.println("Nu ai cont. Inregistreaza-te.");
        }
    }

    public static String readString(FileInputStream fileInputStream) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        int x = fileInputStream.read();
        if (x == -1) {
            return null;
        }
        char c = (char) x;
        while (c != ' ' && c != '\n') {
            stringBuilder.append(c);
            x = fileInputStream.read();
            if (x == -1) {
                return stringBuilder.toString();
            }
            c = (char) x;
        }
        return stringBuilder.toString();
    }

    public static String checkLogin(FileInputStream fileInputStream, String username, String password) throws IOException {
        String newUsername = readString(fileInputStream);
        String newPassword = readString(fileInputStream);
        StringBuilder stringBuilderPassword = new StringBuilder(newPassword);
        stringBuilderPassword.deleteCharAt(newPassword.length() - 1);
        newPassword = stringBuilderPassword.toString();
        while (newUsername != null) {
            if(newUsername.equals(username)) {
                if (newPassword.equals(password)){
                    return "Corect";
                } else {
                    return "Parola gresita";
                }
            }
            newUsername = readString(fileInputStream);
            newPassword = readString(fileInputStream);
            stringBuilderPassword = new StringBuilder(newPassword);
            stringBuilderPassword.deleteCharAt(newPassword.length() - 1);
            newPassword = stringBuilderPassword.toString();
        }
        return "User gresit";
    }
}
