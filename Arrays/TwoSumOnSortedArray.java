import java.util.*;
public class TwoSumOnSortedArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();              // 2 7 11 15
        }
        int target = sc.nextInt();              // 9
        int left = 0;
        int right = n-1;
        while(left<right){
            int sum = arr[left]+arr[right];
            if(sum==target){
                System.out.println(left+" "+right);     // 0 1
                break;
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
           
        }

    }

}
