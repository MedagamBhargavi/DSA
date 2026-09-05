import java.util.*;
public class stackUsingArray{
        int[] stack;
        int top;
        int size;
        stackUsingArray(int size){
            this.size = size;
            stack = new int[size];
            top = -1;
        }
        void push(int value){
            if(top == size-1){
                    System.out.println("Stack is OverFlow");
            }
            top++;
            stack[top] = value;

        }
        int pop(){
            if(top == -1){
                System.out.println("Stack is UnderFlow");
                return -1;
            }
            
            int value = stack[top];
            top--;
            
            return value;
        }
         
        int peek(){
            if(top == -1){
                System.out.println("Stack is Empty");
                return -1;
            }
            return stack[top];
        }

        void display(){
            if(top == -1){
                System.out.println("Stack is Empty");
            }
            for(int i=top;i>=0;i--){
                System.out.print(stack[i]+" ");
            }
            System.out.println();
        }
    
        public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        stackUsingArray s = new stackUsingArray(n);                 
        for(int i=0;i<n;i++){
            s.push(sc.nextInt());            // 10 20 30 40 50 
        }
        s.display();                        //50 40 30 20 10
        System.out.println("Top: "+s.peek());   //50
        System.out.println("Remove: "+s.pop());  //50
        s.display();                        // 40 30 20 10

    }
}

  
