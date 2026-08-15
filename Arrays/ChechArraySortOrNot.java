import java.util.*;
class ChechArraySortOrNot{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
         for(int i=0;i<n;i++){
              arr[i] = sc.nextInt(); // arr[] = [10,20,30,40,50]
        }
        for(int i=0;i<n-1;i++){
            if(arr[i] > arr[i+1]){
                System.out.println("False");
            }
        }
        System.out.println("True"); // o/p: true
    }
}
