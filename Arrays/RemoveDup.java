import java.util.*; 
class RemoveDup{ 
    ArrayList<Integer> removeDuplicates(int arr[]){
        ArrayList<Integer> res = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
           if(set.add(num)){
            res.add(num);
           }
        }
        return res;
    }
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        int arr[] = new int[n]; 
         for(int i=0;i<n;i++){ 
              arr[i] = sc.nextInt(); 
        } 
        RemoveDup r = new RemoveDup();
        ArrayList<Integer> res =  r.removeDuplicates(arr);
 
         for(int num : res){
            System.out.print(num+" ");
         }
    } 
} 
