import java.util.*;
public class ReverseWords{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();               // I Love Java
        String[] words = s.split("\\s+");             
        int left = 0;
        int right = words.length-1;
        while(left<right){
          String temp = words[left];
          words[left] = words[right];
          words[right] = temp;
          left++;
          right--;
        }
        for(String ch  : words){  
            System.out.print(ch+" ");           // Java Love I 
        }
    }

}
  
