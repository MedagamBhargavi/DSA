import java.util.*; 
public class CountWords{ 
   
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in); 
        String s = sc.nextLine();
        String words[]  = s.trim().split("\\s+");           // Hi Every One! How Are Youu.
        int cnt =0;
        for(String word : words){
            cnt++;
        }
        System.out.println(cnt);                     // o/p: 6
        }

    }

