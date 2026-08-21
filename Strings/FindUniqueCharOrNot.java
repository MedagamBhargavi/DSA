import java.util.*;
public class FindUniqueCharOrNot{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();                                                     // world
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(char ch : s.toCharArray()){
                map.put(ch,map.getOrDefault(ch, 0)+1);
        }
        boolean unique = true;
        for(char key : map.keySet()){
            if(map.get(key)>1){
                unique = false;
            }
        }
        if(unique)
            System.out.println("Characters are Unique");                              // unique
        else
            System.out.println("Characters are Not unique");
    }

}
