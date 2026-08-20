import java.util.*; 
public class FirstNonRepeatingElements{ 
   
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in);  
        String s = sc.next();                                             // programming
        LinkedHashMap<Character,Integer> map = new  LinkedHashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }
        for (char key : map.keySet()) {
            if(map.get(key)==1)
                 System.out.println(key+"-->"+map.get(key));                // p --> 1
                break;
        }
        
    }
}
