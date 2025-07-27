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
        tail.next = newNode;
        tail = newNode;
    }

    public void addAtIndex(int index, int val) {
        if (index == 0) {
            ListNode newNode = new ListNode(val);
            newNode.next = head;
            if (head == null) {
                head = newNode;
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
            tail = temp.next;
        }
        temp.next = temp.next.next;
    }

    public static void main(String[] args) {

    }
}
