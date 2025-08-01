public class TwentyFourJuly {
    public static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static ListNode head;

    public static void swapNodes(ListNode head, int k) {
        ListNode temp = head;
        int sz = 0;
        while (temp != null) {
            sz++;
            temp = temp.next;
        }
        ListNode first = head;
        ListNode second = head;
        for (int i = 1; i < k; i++) {
            first = first.next;
        }
        for (int i = 1; i < sz - k + 1; i++) {
            second = second.next;
        }
        int tem = first.data;
        first.data = second.data;
        second.data = tem;
    }

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

    public static ListNode addTwoListNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode ptr = result;

        int carry = 0;
        while (l1 != null || l2 != null) {
            int sum = 0 + carry;
            if (l1 != null) {
                sum = sum + l1.data;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum = sum + l2.data;
                l2 = l2.next;
            }

            carry = sum / 10;
            sum = sum % 10;
            ptr.next = new ListNode(sum);
            ptr = ptr.next;
        }
        if (carry == 1) {
            ptr.next = new ListNode(1);
        }
        return result.next;
    }

    public static void main(String[] args) {
        TwentyFourJuly ll = new TwentyFourJuly();
        TwentyFourJuly ll1 = new TwentyFourJuly();
        ll.add(1);
        ll.add(4);
        ll.add(3);
        ll.add(2);
        ll.add(5);
        ll1.add(1);
        ll1.add(4);
        ll1.add(3);
        ll1.add(2);
        ll1.add(5);
        ll.print();
        swapNodes(head, 2);
        ll.print();
        System.out.println("Sum of Two Lists:");
        ListNode temp = addTwoListNumbers(ll.head, ll1.head);
        while (temp != null) {
            System.out.print(temp.data + "==>");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
