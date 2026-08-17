import java.util.*; 
class LinearSearch{ 
   
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();            // arr[] = [10,20,30,40,50]
        }
        boolean found = false;
        int target = sc.nextInt();             // target = 20
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                found = true;

            }
        }
        if(found){
            System.out.println("element is found");        // o/p : Element is found
        }else{
            System.out.println("Element is not found");
        }

    }
} 
