import java.util.*; 
public class RemoveSpaces{ 
   
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in); 
        String s = sc.nextLine();                      // Hello World
        System.out.println(s.replaceAll("\\s+",""));        // o/p: HelloWord
        }

    }

