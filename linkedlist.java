import java.util.*;

class linkedlist{
    static Scanner sc=new Scanner(System.in);
    Node head=null;
    static class Node{

        int data;
        Node next;
        Node (int d){
            data=d;
            next=null;
        }
    }

  //Method to insert element in begin of linked list
public void insertf(int d){
    Node n=new Node(d);
    if(head==null)
        head=n;
    else
    n.next=head;
    head=n;
}
//method to insert element in middle of linked list
public void insertm(int k,int d){
        Node n=new Node(d);
        Node s=head;
        while(k--!=0)
            s=s.next;
        n.next=s.next;
        s.next=n;
}

//Method to insert element at end of linked list
public void inserte(int d){
        Node n=new Node(d);
        Node s=head;
        while(s.next!=null)
            s=s.next;
        s.next=n;
        n.next=null;
}

//Method to remove the element from linked list
    public void remove(int k){

        Node s=head;
        if(k==1)
            head=head.next;
        else{
        k--;
        while(k--!=1)
            s=s.next;
        if(s.next==null)
            s=null;
        else{
        Node n=s.next;
        s.next=n.next;
    }}}

    //Method to create Linked List in Reverse Order
    public void create(int n){
        System.out.println("enter data");


        for (int i=0; i<n;i++ ){
            int d=sc.nextInt();
            Node nw=new Node(d);
            if(head==null)
                head=nw;
            else{
                nw.next=head;
                head=nw;
            }
        }
    }

//method to print the element of linked list
    public void printlist(){
        Node t=head;
        while(t!=null){
            System.out.print(t.data+" ");
            t=t.next;
        }
        System.out.println();
    }

    public static void main (String[] args) {

        linkedlist ll=new linkedlist();
//        System.out.println("enter no");
//        int n=sc.nextInt();
//        ll.create(n);
//        ll.printlist();
//        ll.insertf(30);
//        ll.printlist();
//        ll.insertm(3,10);
//        ll.printlist();
//        ll.inserte(20);
//        ll.printlist();
//        ll.remove(1);
//        ll.printlist();
//        ll.remove(3);
//        ll.printlist();
//        ll.remove(5);
//        ll.printlist();
    }
}
























