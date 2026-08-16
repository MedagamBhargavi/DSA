import java.util.*;
class MergeArrays{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
         for(int i=0;i<n;i++){
              arr1[i] = sc.nextInt();     // arr[] = [1,2,3,4,5]
        }
        int m = sc.nextInt();
        int arr2[] = new int[m];
        for(int i=0;i<m;i++){
            arr2[i] = sc.nextInt();        // arr[] = [6,7,8,9,1]
        }
        int merge[] = new int[n+m];
        for(int i=0;i<n;i++){
            merge[i]= arr1[i];
        }
        for(int i=0;i<m;i++){
            merge[n+i] = arr2[i];
        }
        Arrays.sort(merge);
        for(int i=0;i<merge.length;i++){
            System.out.print(merge[i]+" ");    // o/p: [1,1,2,3,4,5,6,7,8,9]
        }

        
    }
}
