public class TwentyJuly {
    public static class ListNode{
        int data;
        ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public ListNode head;
    public void add(int data){
        ListNode newNode = new ListNode(data);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public static ListNode mergeTwoList(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);

        ListNode curr = dummy;

        while(l1 != null && l2 != null){
            if(l1.data < l2.data) {
                curr.next = l1;
                curr = l1;
                l1 = l1.next;
            }else{
                curr.next = l2;
                curr = l2;
                l2 = l2.next;
            }
        }
        if(l1 == null){
            curr.next = l2;
        }else{
            curr.next = l1;
        }
        return dummy.next;
    }
    public static void print(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.data + "==>");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public ListNode findMidNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        TwentyJuly ll = new TwentyJuly();
        ll.add(1);
        ll.add(3);
        ll.add(4);
        TwentyJuly ll1 = new TwentyJuly();
        ll1.add(2);
        ll1.add(5);
        ll1.add(6);
        System.out.print("List 1: ");
        print(ll.head);
        System.out.print("List 2: ");
        print(ll1.head);
        ListNode mergedList = mergeTwoList(ll.head, ll1.head);
        System.out.print("Merged List: ");
        print(mergedList);
        ListNode mid = ll.findMidNode(mergedList);
        System.out.println("Middle Node of Merged List is: " + mid.data);
    }
}
