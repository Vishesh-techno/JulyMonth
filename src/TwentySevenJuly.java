public class TwentySevenJuly {
    static class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
    ListNode head;
    ListNode tail;
    public int get(int index){
        if(index < 0){
            return -1;
        }
        int i = 0;
        ListNode temp = head;
        while(temp != null){
            if(i == index){
                return temp.val;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public static void main(String[] args) {

    }
}
