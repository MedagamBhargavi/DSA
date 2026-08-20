import java.util.*; 
public class LeastFreqCount{ 
   
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in); 
        String s = sc.next();                         // hii
        LinkedHashMap<Character,Integer> map = new  LinkedHashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }
        int min =Integer.MAX_VALUE;
        for(char key : map.keySet()){
            min = Math.min(min,map.get(key));                  // min = 1
        }
        for (char key : map.keySet()) {
            if(map.get(key)==min)
                 System.out.println(key+"-->"+map.get(key));       // h --> 1
        }
        
    }
}
