import java.util.*;

public class FirstRepeatingElement {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();                        //hello
        HashSet<Character> set = new HashSet<>();          
        for (char ch : s.toCharArray()) {

            if (set.contains(ch)) {
                System.out.println(ch);               // h
                break;
            }
            set.add(ch);
        }
    }
}
