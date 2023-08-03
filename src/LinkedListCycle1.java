public class Solution {
    public boolean hasCycle(ListNode head) {
        ArrayList l=new ArrayList();
        ListNode curr=head;
        int check=0;
        while(curr!=null)
        {
            if(l.contains(curr))
            {
                break;
            }
            l.add(curr);
            curr=curr.next;
            if(curr==null)
            {
                check=1;
            }
        }
        if(check==1||l.size()==0)
        {
            return false;
        }
        return true;

    }
}