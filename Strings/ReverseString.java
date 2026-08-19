import java.util.*;  
class ReverseString{ 
   
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in); 
        String s = sc.next();                  // s = Ramu
        String rev =" ";
        for(int i=s.length()-1;i>=0;i--){
            rev += s.charAt(i);
        } 
       System.out.println(rev);            // o/p: umaR

    }
} 
// USING STRINGBUILDER
import java.util.*; 
class ReverseString{ 
   
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in); 
        String s = sc.next();
        StringBuilder sb = new StringBuilder(s);
        
        System.out.println(sb.reverse().toString());

    }
} 

//USING TWO POINTERS
import java.util.*; 
class ReverseString{ 
   
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in); 
        String s = sc.next();
        char[] arr = s.toCharArray();
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for(int i=0;i<arr.length;i++){
              System.out.print(arr[i]);
        }
        

    }
} 
