public class TwentyFiveJuly {
    public static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public ListNode head;
    public ListNode tail;

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

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
            current.next = new ListNode(sum);
            current = current.next;

        }
        return reverse(dummy.next);
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

    public ListNode rotateList(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode tail = null;
        ListNode curr = head;
        int size = 0;
        while (curr != null) {
            tail = curr;
            curr = curr.next;
            size++;
        }

        int newK = k % size;
        if (newK == 0) {
            return head;
        }
        int diff = size - newK;

        int i = 0;
        curr = head;
        while (i < diff - 1) {
            curr = curr.next;
            i++;
        }

        ListNode newHead = curr.next;
        curr.next = null;
        tail.next = head;
        return newHead;
    }

    public static void main(String[] args) {
        TwentyFiveJuly ll = new TwentyFiveJuly();
        TwentyFiveJuly ll1 = new TwentyFiveJuly();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.print();

        ll1.add(1);
        ll1.add(3);
        ll1.add(4);
        System.out.print("    ");
        ll1.print();

        TwentyFiveJuly resultList = new TwentyFiveJuly();
        resultList.head = resultList.addTwoNumbers(ll.head, ll1.head);
        resultList.print();

        ll.head = ll.rotateList(ll.head, 15);
        ll.print();

    }
}
