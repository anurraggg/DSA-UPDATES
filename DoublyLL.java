

public class DoublyLL {
    Node head;
    Node tail;

    class Node{
        int val;
        Node next;
        Node prev;
        
        public Node(int val){
            this.val=val;
        }

        public Node(int val, Node next, Node prev){
            this.val=val;
            this.next=next;
            this.prev = prev;
        }
    }

    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null)
        {
        head.prev=node;
        }
        head=node;
    }

    public void display(){
        Node node=head;
        Node last=null;
        while(node!=null)
        {
            System.out.print(node.val + " -> ");
            last=node;
            node=node.next;
        }
        System.out.println("END");

        System.out.println("Print in reverse");
         
        while(last!=null){
            System.out.print(last.val + " -> ");
            last=last.prev;
        }
        System.out.println("Start");
    }


    public static void main(String[] args){
        DoublyLL ll1=new DoublyLL();
        ll1.insertFirst(7);
        ll1.insertFirst(9);
        ll1.insertFirst(8);
        ll1.display();
    }
}
