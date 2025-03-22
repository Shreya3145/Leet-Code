public class LinkedListCycle_1{
    private ListNode head;
    
    public static class ListNode{
        final int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }//added this to prevent the errors!
    public boolean hasCycle(ListNode head) {
         ListNode fastptr = head;
        ListNode slowptr = head;
        while(fastptr!=null && fastptr.next!=null){
            fastptr=fastptr.next.next;
            slowptr=slowptr.next;
            if(fastptr==slowptr){
                return true;
            }
        }
        return false;
        
    }
}
