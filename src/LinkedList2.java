public class LinkedList2 {
   public class Node{
       int data;
       Node next;
       public Node(int data){
           this.data = data;
           this.next = null;
       }
   }
   Node head;
   public void add(int data){
       Node newNode = new Node(data);
       if(head == null){
           head = newNode;
           return;
       }
       Node temp = head;
       while (temp.next != null){
           temp = temp.next;
       }
       temp.next = newNode;
   }
   public void print(){
       Node temp = head;
       while(temp!=null){
           System.out.print(temp.data + "-->");
           temp = temp.next;
       }
       System.out.println("null");
   }

    public static void main(String[] args) {
        LinkedList2 ll = new LinkedList2();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.print();
    }
}
