import java.util.*;
public class stackUsingLinkedList{
        Node top ;
        class Node{
            int data;
            Node next;
            Node(int data){
                this.data = data;
                this.next = null;
            }
        }
        void push(int value){
            Node newNode = new Node(value);
            newNode.next = top;
            top = newNode;

        }
        int pop(){
            if(top == null){
                System.out.println("Stack is UnderFlow");
                return -1;
            }
            
            int value = top.data;
            top = top.next;
            
            return value;
        }
         
        int peek(){
            if(top == null){
                System.out.println("Stack is Empty");
                return -1;
            }
            return top.data;
        }

        void display(){
            if(top == null){
                System.out.println("Stack is Empty");
                return;
            }
            Node temp = top;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    
        public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        stackUsingLinkedList s = new stackUsingLinkedList();
        for(int i=0;i<n;i++){
            s.push(sc.nextInt());
        }
        s.display();
        System.out.println("Top: "+s.peek());
        System.out.println("Remove: "+s.pop());
        s.display();

    }
}

  
