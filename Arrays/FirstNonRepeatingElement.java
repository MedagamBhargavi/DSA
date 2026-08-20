import java.util.*; 
public class FirstNonRepeatingElement{ 
   
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();                      // arr [] = [10,20,30,10,20,30,40,50]
        }
        HashMap<Integer,Integer> map = new  HashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
       
       for(int num : arr){
        if(map.get(num)==1){
            System.out.println(num);                 // 40
            break;
           }
       }
        
    }
}
