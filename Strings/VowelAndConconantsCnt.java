import java.util.*; 
public class VowelAndConconantsCnt{ 
   
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in); 
        String s = sc.next();                        // s = Ramu
        int Vcnt = 0;
        int Ccnt= 0;
        for(int i=0;i<s.length();i++){
            char ch = Character.toLowerCase(s.charAt(i));
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                Vcnt++;
            }else{
                Ccnt++;
            }
        }
        System.out.println("Vowels Count is: "+Vcnt+" Conconants Count is: "+Ccnt);     // Vcnt : 1 Cnnt: 3

    }
} 
