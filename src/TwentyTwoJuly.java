public class TwentyTwoJuly {
    public static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static ListNode head;

    public void add(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void print() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + "==>");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static ListNode removeNode(ListNode head, int val) {
        while (head != null && head.data == val) {
            head = head.next;
        }
        ListNode temp = head;
        while (temp != null) {
            if (temp.next != null && temp.next.data == val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        TwentyTwoJuly ll = new TwentyTwoJuly();
        ll.add(0);
        ll.add(1);
        ll.add(2);
        ll.add(6);
        ll.add(3);
        ll.add(6);
        ll.add(4);
        ll.print();
        head = removeNode(head, 6);
        ll.print();
    }

}
