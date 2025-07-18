public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node Head;
    public static Node Tail;
    public static int Size;

    public void addFirst(int data) {
//        Step 1: Create a new Node
        Node newNode = new Node(data);
        Size++;
        if (Head == null) {
            Head = Tail = newNode;
            return;
        }
//         Step 2: new Node = next;
        newNode.next = Head;
//         Step 3: head = new Node;
        Head = newNode;
    }

    public void addLast(int data) {
//        Step 1: Create a new Node
        Node newNode = new Node(data);
        Size++;
        if (Head == null) {
            Head = Tail = newNode;
            return;
        }
//         Step 2: new Node = next;
        Tail.next = newNode;
//         Step 3: head = new Node;
        Tail = newNode;
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Size++;
        Node temp = Head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void print() {//   TC-O(n)
        if (Head == null) {
            System.out.println("ll is empty");
        }
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public void removeFirst() {
        if (Size == 0) {
            System.out.println("ll is Empty");
            return;
        }
        if (Size == 1) {
            int val = Head.data;
            Head = Tail = null;
            Size = 0;
            return;
        }
        int val = Head.data;
        Head = Head.next;
        Size--;
    }

    public int removeLast() {
        if (Size == 0) {
            System.out.println("ll is Empty");
            return 0;
        }
        if (Size == 1) {
            int val = Head.data;
            Head = Tail = null;
            Size = 0;
            return val;
        }
        Node prev = Head;
        for (int i = 0; i < Size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        Tail = prev;
        Size--;
        return val;
    }

    public int searchIterative(int key) {
        Node temp = Head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node Head, int key) {
        if (Head == null) {
            return -1;
        }
        if (Head.data == key) {
            return 0;
        }
        int idx = helper(Head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(Head, key);
    }

    public void reverseLL() {
        Node prev = null;
        Node curr = Head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Head = prev;
    }
    public void deleteNthNodeFromEnd(int n){
        int sz = 0;
        Node temp = Head;
        while(temp != null){
            sz++;
            temp = temp.next;
        }

        if(n>sz){
            System.out.println("index not found or out of bound index");
            return;
        }

        if(n == sz){
            Head = Head.next;
            return;
        }

        int i = 0;
        int j = sz-n;
        Node prev = Head;
        while(i<j){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }
    public Node findMidNode(Node Head){
        Node slow = Head;
        Node fast = Head;
        while(fast !=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
//    check LikedList is a palindrome
    public boolean isPalindrome(){
        if(Head == null || Head.next == null){
            return true;
        }

//      find midNode
        Node midNode = findMidNode(Head);

//        reverse second half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr!=null){
         next = curr.next;
         curr.next = prev;
         prev = curr;
         curr = next;
        }

//        check left half and right half

        Node right = prev;
        Node left = Head;

        while(right != null){
            if(left.data != right.data){
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
//        ll.addFirst(2);//        head: 2
//        ll.addFirst(1);//        head: 1
//        ll.addLast(4);//         Tail: 3
//        ll.addLast(5);//         Tail: 4
//        ll.print();
//        ll.add(2, 3);
//        ll.print();
//        System.out.println(Size);
////        ll.removeFirst();
//        ll.print();
//        System.out.println(Size);
////        ll.removeLast();
//        ll.print();
//        System.out.println(Size);
//        ll.searchIterative(3);
//        System.out.println("The key is found at: " + ll.searchIterative(3));
//        System.out.println("The key is found at: " + ll.recSearch(3));
//        System.out.println("The key is found at: " + ll.recSearch(10));
//        ll.reverseLL();
//        System.out.print("The reverse String is: ");
//        ll.print();
//        ll.deleteNthNodeFromEnd(3);
//        ll.deleteNthNodeFromEnd(10);
//        ll.deleteNthNodeFromEnd(4);
//        ll.print();
//        System.out.println(Size);

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(1);
        ll.print();
        System.out.println(ll.isPalindrome());
    }
}
