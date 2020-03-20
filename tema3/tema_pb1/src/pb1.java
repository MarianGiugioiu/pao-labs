import java.util.HashMap;
import java.util.Scanner;

public class pb1 {
    static final int NO_OF_CHARS = 256;
    static HashMap<Character,Integer> m1 = new HashMap<Character, Integer>(NO_OF_CHARS);
    static HashMap<Character,Integer> m2 = new HashMap<Character, Integer>(NO_OF_CHARS);
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S1 = scan.nextLine();
        for (int i = 0; i < S1.length(); i++) {
            Character c = S1.charAt(i);
            if(m1.containsKey(c)){
                m1.put(c, m1.get(c) + 1);
            } else {
                m1.put(c,1);
            }
        }

        String S2 = scan.nextLine();
        for (int i = 0; i < S2.length(); i++) {
            Character c = S2.charAt(i);
            if(m2.containsKey(c)){
                m2.put(c, m2.get(c) + 1);
            } else {
                m2.put(c,1);
            }
        }
        boolean g = true;
        for (Character key   : m1.keySet()) {
            if(key != ' '){
                if (m1.get(key) != m2.get(key)){
                    g = false;
                    break;
                }
            }
        }
        if(g){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
