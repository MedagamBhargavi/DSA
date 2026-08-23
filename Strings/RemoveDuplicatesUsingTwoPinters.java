import java.util.*;
public class RemoveDuplicatesUsingTwoPointers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();            //hello
        char[] arr = s.toCharArray();
        int slow = 0;
        for(int fast = 1; fast<s.length();fast++){
           if(arr[fast]!=arr[slow]){
            slow++;
            arr[slow] = arr[fast];
           }
        }
        for(int i=0;i<=slow;i++){
            System.out.print(arr[i]);           //helo
        }
    }

}
  
