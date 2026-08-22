import java.util.*;
public class Palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();                           // madam
        char arr[] = s.toCharArray();
        int left = 0;
        int right = s.length()-1;
        boolean found = true;
        while(left<right){
            if(arr[left] != arr[right]){
               found = false;
            }
            left++;
            right--;
        }
        
        if(found){
            System.out.println(s+" is Palindrome");           // madam is Palindrome
        }else{
            System.out.println(s+" is not Palindrome");
        }

           
    }

}

