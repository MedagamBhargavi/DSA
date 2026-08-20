import java.util.*; 
public class FindDuplicateElements{ 
   
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();            // arr[] = [1,2,3,1,2,3,5,4]
        }
        HashMap<Integer,Integer> map = new  HashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
       
      for (int num : arr) {
       if (map.get(num) > 1) {
           System.out.println(num);            // 1,2,3
           map.put(num, 0);
        }
       }
        
    }
}
