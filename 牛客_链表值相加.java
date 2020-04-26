public class Plus {
    public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
        if(a == null)
            return b;
        if(b == null)
            return a;
        ListNode head = new ListNode(0);
        ListNode temp = head;
        int sum = 0;
        while(a != null || b != null || sum != 0){//之所以判断sum!=0，当l1和l2遍历完，如果还有进位，需要处理
            if(a != null){
                sum += a.val;
                a = a.next;
            }
            if(b != null){
                sum += b.val;
                b = b.next;
            }
            temp.next = new ListNode(sum%10);
            sum /= 10;
            temp = temp.next;
        }
        return head.next;
    }
}