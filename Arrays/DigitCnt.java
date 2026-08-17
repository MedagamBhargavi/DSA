import java.util.*; 
class DigitCnt{ 
   
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();                // n = 1234
        int cnt=0;
        while(n>0){
            n=n/10;
            cnt++;
        }
        System.out.println(cnt);             // o/p: 4
    }
} 
