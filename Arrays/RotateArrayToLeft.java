import java.util.*;
class RotateArrayToLeft{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
         for(int i=0;i<n;i++){  
              arr[i] = sc.nextInt();    // arr[] = [1,2,3,4,5]
        }
        int last = arr[0];
        for(int i=0;i<n-1;i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = last;
        for(int i=0;i<n;i++){
              System.out.print(arr[i]+" ");    // o/p: [2,3,4,5,1]
        }
        
    }
}
