import java.util.HashSet;
import java.util.Set;

public class TwentyOneJuly {
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

    public boolean hasCycle(ListNode list){
        Set<ListNode> set = new HashSet<>();
        ListNode curr = list;

        while(curr != null){
            if(set.contains(curr)){
                return true;
            }
            set.add(curr);
            curr = curr.next;
        }
        return false;
    }

    public static boolean hasCycleOptimal(){
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void removeCycle(){
//        detect cycle exist or not
        ListNode slow = head;
        ListNode fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                cycle = true;
                break;
            }
        }

        if(!cycle){
            return;
        }

//        if cycle exist slow = head; and fast = fast.next; and they meet at cyclic point
        slow = head;
//        ListNode prev = null;
//        while(slow != fast){
//            slow = slow.next;
//            fast = fast.next;
//            prev = fast;
//        }
        if (slow == fast) {
            // cycle starts at head
            while (fast.next != slow) {
                fast = fast.next;
            }
            fast.next = null;
        } else {
            while (slow.next != fast.next) {
                slow = slow.next;
                fast = fast.next;
            }
            fast.next = null; // properly remove the cycle
        }

//        remove cycle and give null
//        prev.next = null;
    }

    public static void main(String[] args) {
        TwentyOneJuly ll = new TwentyOneJuly();
//        ll.add(1);
//        ll.add(2);
//        ll.add(3);
//        ll.add(3);
//        ll.add(2);
//        ll.add(4);
//        ll.add(3);
//        ll.add(2);
//        ll.add(4);
        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = head.next;
//        ll.print();
//        System.out.println(ll.isPalindrome(head));
//        System.out.println(ll.hasCycle(head));
        System.out.println(hasCycleOptimal());
        removeCycle();
        System.out.println(hasCycleOptimal());
        ll.print();

    }
}
