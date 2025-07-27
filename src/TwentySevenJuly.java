
public class TwentySevenJuly {
    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    ListNode head;
    ListNode tail;

    public int get(int index) {
        if (index < 0) {
            return -1;
        }
        int i = 0;
        ListNode temp = head;
        while (temp != null) {
            if (i == index) {
                return temp.val;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addAtLast(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        tail = newNode;
    }

    public void addAtIndex(int index, int val) {
        if (index == 0) {
            ListNode newNode = new ListNode(val);
            newNode.next = head;
            head = newNode;
            if (tail == null) {
                tail = newNode;
                return;
            }
        }
        int i = 0;
        ListNode temp = head;
        while (temp != null && i < index - 1) {
            temp = temp.next;
            i++;
        }
        if (temp == null) {
            return;
        }
        ListNode newNode = new ListNode(val);
        newNode.next = temp.next;
        temp.next = newNode;

        if (newNode.next == null) {
            tail = newNode;
        }
    }

    public void deleteAtIndex(int index) {
        if (index == 0) {
            if (head == null) {
                return;
            }
            head = head.next;
            return;
        }
        ListNode temp = head;
        int i = 0;
        while (temp.next != null && i < index - 1) {
            temp = temp.next;
            i++;
        }
        if (temp.next == null) {
            return;
        }
        if (temp.next.next == null) {
            tail = temp;
        }
        temp.next = temp.next.next;
    }

    public void print() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + "==>>");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        TwentySevenJuly ll = new TwentySevenJuly();
        ll.addAtHead(1);      // List: 0
        ll.addAtHead(0);
        ll.addAtLast(4);      // List: 1 -> 0 -> 4
        ll.addAtLast(5);      // List: 1 -> 0 -> 4 -> 5
        ll.addAtIndex(2, 2);  // List: 1 -> 0 -> 4 -> 2 -> 5
        ll.addAtIndex(3, 3);  // List: 1 -> 0 -> 4 -> 2 -> 3 -> 5
        ll.addAtIndex(6, 8);// List: 1 -> 0
        ll.print();
        System.out.println("Value at index 6: " + ll.get(6));
        ll.print();
        ll.deleteAtIndex(6);
        ll.print();
    }
}
