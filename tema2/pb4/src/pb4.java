import java.util.Scanner;

public class pb4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Student[] studenti = new Student[n];
        scan.nextLine();
        for (int i = 0; i < n; i++) {
            String s = scan.nextLine();
            String[] S = s.split(" ");
            String[] student = new String[2];
            int k=0;
            for(String a : S){
                student[k++]=a;
            }

            studenti[i] = new Student(student[0],Integer.valueOf(student[1]));
        }

        for (int i = 0; i < n; i++) {
            System.out.println(studenti[i].getNume() + " " + studenti[i].getNota());
        }
    }
}

