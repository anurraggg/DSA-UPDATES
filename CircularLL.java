public class CircularLL 
{
    Node head;
    Node tail;


    class Node{
        int val;
        Node next;

        public Node(int val){
            this.val=val;
        }
    }

    public void insert(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
            tail=node;
            return;
        }

        tail.next=node;
        node.next=head;
        tail=node;
    }

    public void delete(int val){
        Node temp=head;
        if(head==null){
            return;
        }

        while(temp.next.val!=val){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }

    public void display(){
        Node node=head;
        if(head!=null){
            do{
                System.out.print(node.val+" -> ");
                node=node.next;
            } while(node!=head);
        }
        System.out.print("HEAD");

    }

    public static void main(String[] args){
        CircularLL ll1=new CircularLL();
        ll1.insert(7);
        ll1.insert(9);
        ll1.insert(8);
        ll1.insert(5);
        ll1.insert(99);
        ll1.delete(5);
        
        ll1.display();
    }
}
