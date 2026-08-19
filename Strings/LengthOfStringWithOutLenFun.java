import java.util.*; 
public class LengthOfStringWithOutLenFun{ 
   
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in); 
        String s = sc.next();                        // s = ramu
        int len=0;
        for(int i=0;i<s.length();i++){
            len++;
        }
        System.out.println("Length of the String "+len);  // o/p: 4

    }
} 
