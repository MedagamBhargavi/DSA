import java.util.*; 
public class ComparingStrings{ 
   
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in);  
        String s1 = sc.nextLine();                   // Hello Every ONe! How are youuuuu
        String s2 = sc.nextLine();                   // hello every one! how are YOUUUUU
        if(s1.equalsIgnoreCase(s2)){
        System.out.println("Both are equals");
        }else{
        System.out.println("Both are not equal");
        }

    }
}
