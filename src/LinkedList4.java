public class LinkedList4{
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public Node head;
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public Node getNodeByValue(int val){
        Node temp = head;
        while(temp != null){
            if(temp.data == val){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    public void deleteNode(Node node){
//        if(head == null || node == null) return;
//
//        if(head == node){
//            head = head.next;
//            return;
//        }
//       Node temp = head;
//       while(temp.next != node){
//           temp = temp.next;
//       }
//       temp.next = temp.next.next;

        node.data = node.next.data;
        node.next = node.next.next;
    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedList4 ll = new LinkedList4();
        ll.add(1);
        ll.add(2);
        ll.add(5);
        ll.add(3);
        ll.add(4);
        ll.print();
        Node ndelete = ll.getNodeByValue(5);
        ll.deleteNode(ndelete);
        ll.print();

    }
}
