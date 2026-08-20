import java.util.*; 
public class MostFreqCharacter{ 
   
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in); 
        String s = sc.next();                                           // programming
        LinkedHashMap<Character,Integer> map = new  LinkedHashMap<>(); 
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }
        int max =0;
        for(char key : map.keySet()){
            max = Math.max(max,map.get(key));                          // max = 2
        }
        for (char key : map.keySet()) {
            if(map.get(key)==max)  
                 System.out.println(key+"-->"+map.get(key));          // r --> 2 
        }                                                             // g --> 2 
                                                                      // m -->2
    }
}
