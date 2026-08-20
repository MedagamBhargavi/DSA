import java.util.*; 
public class EleAppearingOnce{ 
   
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();                     // arr[] = [1,2,3,2,5]
        }
        HashMap<Integer,Integer> map = new  HashMap<>();
        for(int num : arr){
            map.put(num,1);
        }
       
       for (int num : arr) {
          if(map.get(num)==1){
             System.out.println(num);                   // o/p: 1,3,4,5
          }
       }
        
    }
}
