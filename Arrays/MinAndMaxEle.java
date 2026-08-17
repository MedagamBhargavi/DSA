import java.util.*; 
class MinAndMaxEle{ 
   
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();           // arr[] = [10,30,5,50,98]
        }
        int minEle = arr[0];
        int maxEle = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<minEle){
                minEle = Math.min(minEle, arr[i]);

            }else if(arr[i]>maxEle){
                maxEle = Math.max(maxEle,arr[i]);
            }
        }
       System.out.println("Minimum Element: "+minEle+" "+"Maximum Element: "+maxEle);          // o/p: 5,98

    }
} 
