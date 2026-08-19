import java.util.*; 
public class FirstAndLastChar{ 
   
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in); 
        String s = sc.nextLine();                      // Hello
        int n = s.length();
        for(int i=0;i<n;i++){
            if(i==0  || i ==(n-1)){
                System.out.print(s.charAt(i)+" ");          // o/p:  H o
            }
        }
        }

    }

