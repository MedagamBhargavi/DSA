import java.util.*;
class RotateArrayToRight{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
         for(int i=0;i<n;i++){
              arr[i] = sc.nextInt();   // arr[] = [1,2,3,4,5]
        }
        int first = arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = first;
        for(int i=0;i<n;i++){
              System.out.print(arr[i]+" ");   // o/p: [5,1,2,3,4]
        }
        
    }
}
