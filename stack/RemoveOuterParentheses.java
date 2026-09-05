import java.util.*;
public class RemoveOuterParentheses{
       public static String  removeOuterParentheses(String s){
        StringBuffer result = new StringBuffer();
        int depth = 0;
        for(char ch : s.toCharArray()){
              if(ch == '('){
                     if(depth >0){
                            result.append('(');
                     }
                     depth++;
              }else{
              
                     depth--;
                     if(depth >0){
                            result.append(')');
                     }
              }
        }
        return result.toString();


       }
       public static void main(String args[]){
              Scanner sc = new Scanner(System.in);
              String s= sc.next();
              System.out.println(removeOuterParentheses(s));
       }
}

  
