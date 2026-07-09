// Last updated: 7/9/2026, 3:09:29 PM
class Solution {
public:
    ListNode* reverseKGroup(ListNode* head, int k) {

        ListNode* curr = head;

        // Check if k nodes are available
        for (int i = 0; i < k; i++) {
            if (curr == nullptr)
                return head;
            curr = curr->next;
        }

        // Reverse first k nodes
        ListNode* prev = nullptr;
        curr = head;

        for (int i = 0; i < k; i++) {
            ListNode* nextNode = curr->next;
            curr->next = prev;
            prev = curr;
            curr = nextNode;
        }

        // head is now the tail of this group
        head->next = reverseKGroup(curr, k);

        // prev is the new head of this group
        return prev;
    }
};