class ReverseLinkedList {
    private ListNode head;
    
    public static class ListNode{
        final int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }//added this to prevent the errors!
        public ListNode reverseList(ListNode head) {
            ListNode current = head;
            ListNode previous = null;
            ListNode next = null;
            if(head==null){
                return head;
            }
            while(current!=null){
                next = current.next;
                current.next = previous;
                previous = current;
                current = next;
            }
            return previous;
    }
}
