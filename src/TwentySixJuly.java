import java.util.HashSet;
import java.util.Set;

public class TwentySixJuly {
    public static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public ListNode head;

    public ListNode intersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        while (tempA != null) {
            ListNode tempB = headB;
            while (tempB != null) {
                if (tempA == tempB) {
                    return tempA;
                }
                tempB = tempB.next;
            }
            tempA = tempA.next;
        }
        return null;
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
            System.out.print(temp.data + "==>>");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public ListNode intersectionNodeBetter(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }
        while (headB != null) {
            if (set.contains(headB)) {
                return headB;
            }
            set.add(headB);
            headB = headB.next;
        }
        return null;
    }

    public ListNode intersectionNodeOptimal(ListNode headA, ListNode headB) {
        ListNode currA = headA;
        ListNode currB = headB;
        while (currA != currB) {
            if (currA == null) {
                currA = headB;
            } else {
                currA = currA.next;
            }

            if (currB == null) {
                currB = headA;
            } else {
                currB = currB.next;
            }
        }
        return currA;
    }

    public void evenAndOddList(ListNode head) {
        if (head == null) {
            return;
        }
        ListNode odd = head, even = head.next;
        ListNode evenHead = head.next;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
    }

    public static void main(String[] args) {
        TwentySixJuly ll = new TwentySixJuly();
        ll.add(0);
        ll.add(1);
        ll.add(2);
        ll.add(3);


        TwentySixJuly ll1 = new TwentySixJuly();
        ll1.add(9);
        ll1.add(10);
        ll1.add(11);
        ll1.add(12);


        TwentySixJuly ll2 = new TwentySixJuly();
        ll2.add(4);
        ll2.add(5);
        ll2.add(6);
        ll2.add(7);
        ll2.add(8);

        ListNode temp = ll.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = ll2.head;

        temp = ll1.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = ll2.head;


        ll.print();
        ll1.print();

        ListNode result = ll.intersectionNode(ll.head, ll1.head);
        if (result != null) {
            System.out.println("Intersection at node with data: " + result.data);
        } else {
            System.out.println("No intersection found.");
        }

        ListNode result2 = ll.intersectionNodeBetter(ll.head, ll1.head);
        if (result2 != null) {
            System.out.println("Intersection at node with data: " + result.data);
        } else {
            System.out.println("No intersection found.");
        }

        ListNode result1 = ll.intersectionNodeOptimal(ll.head, ll1.head);
        if (result1 != null) {
            System.out.println("Intersection at node with data: " + result.data);
        } else {
            System.out.println("No intersection found.");
        }

        ll.evenAndOddList(ll.head);
        ll.print();
    }
}
