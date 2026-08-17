import java.util.*; 
class ReverseNum{ 
   
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();     // n = 2345
        int rev=0;
        while(n>0){
            int digit = n%10;
             rev = rev*10+digit;
            n=n/10;
        }
        System.out.println(rev);    // o/p: 5432
    }
} 
