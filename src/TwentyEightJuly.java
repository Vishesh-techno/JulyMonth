
public class TwentyEightJuly {
    public static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public ListNode head;

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2){
        ListNode dummy = new ListNode(0);
        dummy.next = list1;

        ListNode temp = list1;
        int i = 0;
        while(temp != null && i<a-1){
            temp = temp.next;
            i++;
        }
        ListNode temp1 = list1;
        int j = 0;
        while(temp1 != null && j<=b){
            temp1 = temp1.next;
            j++;
        }

        temp.next = list2;
        ListNode l2 = list2;
        while(l2.next != null){
            l2 = l2.next;
        }

        l2.next = temp1;
        return dummy.next;
    }
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
    public void print(){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.data + "==>");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        TwentyEightJuly ll = new TwentyEightJuly();
        ll.add(10);
        ll.add(1);
        ll.add(13);
        ll.add(6);
        ll.add(9);
        ll.add(5);
        ListNode list1 = ll.head;
        ll.print();

        TwentyEightJuly ll1 = new TwentyEightJuly();
        ll1.add(1000001);
        ll1.add(1000002);
        ll1.add(1000000);
        ListNode list2 = ll1.head;
        ll1.print();

        ll.head = ll.mergeInBetween(list1, 2, 4, list2);
        ll.print();
    }

}
