import java.util.*; 
public class EleFreqCount{ 
   
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();                        // arr[] = [1,2,1,2,3]
        }
        HashMap<Integer,Integer> map = new  HashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
       //  keySet() for traverse 
       for(int key : map.keySet())
             System.out.println(key+"-->"+map.get(key));   // 1 --> 2
                                                           // 2 --> 2
                                                           // 3 --> 1
    }
}
