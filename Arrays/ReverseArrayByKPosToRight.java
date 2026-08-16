import java.util.*;
class ReverseArrayByKPosToRight{
    public static void reverse(int[] arr,int start,int end){
        while(start<=end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end]=temp; 
            start++;
            end--;
        }
        
    }
    public static void rotate(int arr[],int k){
        int n = arr.length;
        k = k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
         for(int i=0;i<n;i++){
              arr[i] = sc.nextInt();   // arr[] = [1,2,3,4,5,6,7]
        }
        int k = sc.nextInt();
        
        rotate(arr,k);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" "); //o/p: [5,6,7,1,2,3,4]
        }

    }
}
