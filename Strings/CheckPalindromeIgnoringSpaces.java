import java.util.*; 
public class CheckPalindromeIgnoringSpaces{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();                              // mad am
        char arr[] = s.toCharArray();
        int left = 0;
        int right = s.length()-1;
        boolean found = true;
        while(left<right){
            if(arr[left]==' '){
                left++;
                continue;
            }
            if(arr[right]==' '){
                right--;
                continue;
            }

            if(arr[left] != arr[right]){
               found = false;
            }
            left++;
            right--;
        }
        if(found){
            System.out.println(s+" is Palindrome");         // mad am is Palindrome
        }else{
            System.out.println(s+" is not Palindrome");
        }     
    }

}
  
