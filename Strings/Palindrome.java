import java.util.*; 
class Plaindrome{ 
   
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in); 
        String s = sc.next();
        String original = s;
        String rev ="";
        for(int i=s.length()-1;i>=0;i--){
            rev += s.charAt(i);
        }
        if(original.equals(rev)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }

    }
} 
