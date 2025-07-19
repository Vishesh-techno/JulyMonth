public class LinkedList4 {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public Node getNodeByValue(int val) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == val) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void deleteNode(Node node) {
//        if head is given
        if (head == null || node == null) return;

        if (head == node) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != node) {
            temp = temp.next;
        }
        temp.next = temp.next.next;

//       if head is not given

//        node.data = node.next.data;
//        node.next = node.next.next;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void removeNthNodeFromEnd(int n) {
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            sz++;
            temp = temp.next;
        }

        if (n > sz) {
            return;
        }

        if (head == null || n <= 0) {
            return;
        }

        if (n == sz) {
            head = head.next;
            return;
        }

        int i = 0;
        int j = sz - n;
        Node forw = head.next;
        while (i < j - 1) {
            forw = forw.next;
            i++;
        }
        forw.next = forw.next.next;
    }

    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        LinkedList4 ll = new LinkedList4();
        ll.add(1);
        ll.add(2);
        ll.add(5);
        ll.add(3);
        ll.add(4);
        ll.print();
//        Node ndelete = ll.getNodeByValue(5);
//        if (ndelete != null && ndelete.next != null) {
//            ll.deleteNode(ndelete);
//        }
//        ll.print();
        ll.removeNthNodeFromEnd(4);
        ll.print();
        ll.reverse();
        ll.print();

    }
}
