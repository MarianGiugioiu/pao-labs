import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class pb3 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src/clienti.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int nrMinori = 0;
        int nrMajori = 0;
        String linie = bufferedReader.readLine();
        List<String> listaMajori = new ArrayList<String>();
        while (linie != null) {
            String[] elemente = linie.split(" ");
            if (Integer.parseInt(elemente[2]) < 18) {
                nrMinori++;
            } else {
                nrMajori++;
                StringBuilder stringBuilder = new StringBuilder(elemente[0]);
                stringBuilder.append(" ");
                stringBuilder.append(elemente[1]);
                listaMajori.add(stringBuilder.toString());
            }
            linie = bufferedReader.readLine();
        }

        System.out.println(nrMinori);
        System.out.println(nrMajori);
        for (String string : listaMajori) {
            System.out.println(string);
        }
    }
}
