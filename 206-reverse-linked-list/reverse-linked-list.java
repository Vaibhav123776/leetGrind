class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode prev = null;        // Initially no previous node
        ListNode current = head;     // Start from head
        
        while (current != null) {
            ListNode nextNode = current.next;  // Store next node
            
            current.next = prev;               // Reverse the link
            
            prev = current;                    // Move prev forward
            current = nextNode;                // Move current forward
        }
        
        return prev;   // New head after reversal
    }
}
