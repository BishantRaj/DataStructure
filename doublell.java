import java.util.*;

public class doublell {
    Scanner sc=new Scanner(System.in);
    Node head=null;
    Node tail=null;
    static class Node{
        int data;
        Node next;
        Node prev;
        Node (int d){
            data=d;
            next=null;
            prev=null;
        }
    }
//method to create double LL
    public void create(int n){
        while(n-->0){
            int d=sc.nextInt();
            Node nw=new Node(d);
            if (head==null){
                head=nw;
                tail=nw;
            }
            else{
                head.prev=nw;
                nw.next=head;
                head=nw;
            }
        }
    }
	
//method to insert element at begin of DLL
    public void insertb(int d){
        Node nw=new Node(d);
        head.prev=nw;
        nw.next=head;
        head=nw;
    }
	
//method to insert element at middle of DLL
    public void insertm(int k,int d){
        Node nw=new Node(d);
        Node t=head;
        while(k-->1){
            t=t.next;
        }
        nw.next=t.next;
        nw.next.prev=nw;
        t.next=nw;
        nw.prev=t;
    }
	
//method to insert element at end of DLL
    public void inserte(int d){
        Node nw=new Node(d);
        tail.next=nw;
        nw.prev=tail;
        tail=nw;
    }
    

//method to delete element of DLL	
    public void remove(int k){
        Node t=head;
        if (k==0) {
            head=t.next;
            t.next.prev = null;
        }
        else{

        while(k-->1){
            t=t.next;
        }
         if(t.next.next==null){

             t.next=null;
             tail=t;
        }
         else {
             t.next.next.prev=t;
             t.next=t.next.next;
         }
        }
    }


//method to print elements of DLL
    public void print(){
        Node t=head;
        while(t!=null){
            System.out.print(t.data+" ");
            t=t.next;
        }
        System.out.println();
    }
	
//method to check if linked list is doubleLL
    public void check(int d){
        Node n=head;
        while(n.data!=d){
            n=n.next;
        }
        if(n.next==null)
            System.out.println(+n.prev.data+" "+"null");
        else if(n.prev==null)
            System.out.println("null"+" "+n.next.data);
        else
        System.out.println(n.prev.data+" "+n.next.data);
    }

    public static void main(String args[]){
        // doublell dll=new doublell();
        // dll.create(5);
        // dll.print();
        // dll.insertb(50);
        // dll.print();
        // dll.insertm(3,30);
        // dll.print();
        // dll.check(30);
        // dll.inserte(100);
        // dll.print();
        // dll.check(100);
        // dll.check(8);
        // dll.remove(0);
        // dll.print();
        // dll.remove(3);
        // dll.print();
        // //dll.remove(4);
        // //dll.print();
        // dll.remove(5);
        // dll.print();
        // dll.check(8);

    }
}
