package linkedlist;

public class Linkedlist {

    private Node head;
    private Node tail;
    private int size;
    public void Linkedlist(){
        this.size=0;
    }

    public void insertStart(int value){
        Node node = new Node(value);
        node.next=head;
        head=node;
        if(tail==null)tail=head;
        size++;


    }
    public void insertRec(int val , int index){
        head=insertRecursion(head,val,index);
    }

    public Node insertRecursion(Node node , int value , int index){
        if(index==0){
            Node n = new Node(value,node);
            size++;
            return n;
        }

        node.next=insertRecursion(node.next, value,index-1);
        return node;
    }
    public void diplay(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("END");

    }


    private class Node{
        private int value;
        private Node next;




        public Node(int value){
            this.value=value;

        }

        public Node(int value , Node next){
            this.value=value;
            this.next=next;
        }


    }
}
