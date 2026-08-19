import java.util.*; 
class UpperAndLowerCaseLetterCnt{ 
   
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in); 
        String s = sc.next();
        int UpperCnt = 0;
        int LowerCnt= 0;
        for(int i=0;i<s.length();i++){
            
            if(Character.isLowerCase(s.charAt(i))){
                LowerCnt++;
            }else if(Character.isUpperCase(s.charAt(i))){
                UpperCnt++;
            }
        }
        System.out.println("UpperCase Letter Count is: "+UpperCnt+" LowerCase Letter  Count is: "+LowerCnt);

    }
} 
