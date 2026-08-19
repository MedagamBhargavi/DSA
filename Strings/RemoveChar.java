import java.util.*; 
public class RemoveChar{ 
   
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in); 
        String s = sc.next();               // Hello 
        char remove = sc.next().charAt(0);  // l
        String res = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != remove){
                res += s.charAt(i);
            }
        }
        System.out.println(res);           // o/p : heo
     
    }
}
