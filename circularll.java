import java.util.*;

public class circularll {
    static Scanner sc=new Scanner(System.in);
    Node head=null;
    Node tail=null;
    static class Node{
        int data;
        Node next;

        Node(int d){
            data=d;
            next=null;
        }

    }
//create circularll
    public void create(int n){
        System.out.println("enter data");
        while(n-->0){
            int d=sc.nextInt();
            Node nw=new Node(d);
            if(head==null) {
                head = nw;
                tail=nw;
                nw.next=head;
            }
            else {
                nw.next = head;
                head = nw;
                tail.next=head;
            }

        }
    }
//insert at begin
    public void insertb(int d){ 
        Node nw=new Node(d);

        nw.next=head;
        head=nw;
        tail.next=head;
    }
//insert at end
    public void inserte(int d){
        Node nw=new Node(d);
        tail.next=nw;
        tail=nw;
        tail.next=head;
    }
	
//remove element
    public void remove(int k){
        Node t=head;
        if (k==0){

            head=t.next;
            tail.next=head;
        } else {

            while(k-->1){
                t=t.next;
            }
            if(t.next==tail){

                tail=t;
                head=tail.next.next;


            }
            Node n=t.next;
            t.next=n.next;
        }
    }

    /*public void removee(){
        Node t=head;
        Node n=t.next;
        while(t.next!=tail)

    }*/
//print element
    public void print(){
        Node t=head;
        if(head != null){
            do{
                System.out.print(t.data+" ");
                t=t.next;
            }
            while (t!=head);
        }
        System.out.println();
    }

    public static void main(String args[]){
        // int n= sc.nextInt();
        // circularll cll=new circularll();
        // cll.create(n);
        // cll.print();
        // cll.insertb(80);
        // cll.print();
        // cll.inserte(60);
        // cll.print();
        // cll.remove(0);
        // cll.print();
        // cll.remove(2);
        // cll.print();
        // cll.remove(4);
        // cll.print();
        // cll.remove(1);
        // cll.print();

    }
}