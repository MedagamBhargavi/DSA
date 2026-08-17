import java.util.*; 
class ArmStrongNum{ 
   
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();                // n = 153
        int original = n;
        int sum=0;
        while(n>0){
            int digit = n%10;
             sum = sum+digit*digit*digit;
            n=n/10;
        }
        if(original==sum)
        System.out.println(sum+" is Armstrong number");         //o/p: 153 is a ArmStrong number
        else
            System.out.println(sum+" is not a Armstrong num");
    }
} 
