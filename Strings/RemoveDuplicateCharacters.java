import java.util.*;
public class RemoveDuplicateCharacter{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();                                              // helloo
        LinkedHashSet<Character> set = new LinkedHashSet<>();             // for inseted order purpose 
        for(char ch : s.toCharArray()){
             set.add(ch);    
        }
        for(char ch : set){
            System.out.print(ch);                                        // helo
        }
    }

}
