import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;

public class pb1 {

    static final int NO_OF_CHARS = 256;
    static HashMap <Character,CountPos> m = new HashMap<Character, CountPos>(NO_OF_CHARS);
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S = scan.nextLine();
        for (int i = 0; i < S.length(); i++){
            Character c = S.charAt(i);
            if(m.containsKey(c)){
                m.get(c).incCount();
            } else {
                m.put(c,new CountPos(i));
            }
        }
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < S.length(); i++){
            Character c = S.charAt(i);
            if(m.get(c).count == 1 && m.get(c).pos < result){
                result = m.get(c).pos;
            }
        }
        System.out.println(S.charAt(result));
    }
}
