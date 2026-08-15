import java.util.*;
class ExamDemo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
         for(int i=0;i<n;i++){
              arr[i] = sc.nextInt(); // arr[] = [1 , 8, 7, 56, 90]
        }
        int max = arr[0];
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max = Math.max(max,arr[i]);
            }
        }
        System.out.println("Largest element in array:"+max); // o/p:90
    }
}
