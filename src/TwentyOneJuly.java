public class TwentyOneJuly {
    public static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public ListNode head;

    public void add(int data) {
        ListNode temp = head;
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
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

    public Boolean isPalindrome(ListNode list) {
        if (list == null || list.next == null) {
            return true;
        }


        ListNode slow = list;
        ListNode fast = list;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        ListNode curr = slow;
        ListNode next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode left = list;
        ListNode right = prev;
        while (right != null && left != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        TwentyOneJuly ll = new TwentyOneJuly();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(3);
        ll.add(2);
        ll.add(4);
        ll.print();
        System.out.println(ll.isPalindrome(ll.head));

    }
}
