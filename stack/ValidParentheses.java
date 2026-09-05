import java.util.*;


public class ValidParentheses{
       public static boolean isValid(String s){
       
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '{' || ch == '[' || ch == '('){
                st.push(ch);
            }
            else{

                if(st.isEmpty()){
                    return false;
                }
                int top = st.pop();
                if(ch  == '}' && top != '{'){
                    return false;
                }
                if(ch == ')' && top != '(' ){
                    return false;
                }
                if(ch == ']' && top != '[' ){
                    return false;
                }


            }
            
        }
        return st.isEmpty();
       }    
        
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            System.out.println(isValid(s));                    // {[]} true
        }  
}

  
