// Last updated: 7/9/2026, 3:09:31 PM
class Solution {
public:
    ListNode* swapPairs(ListNode* head) {

        ListNode* dummy = new ListNode(0);
        dummy->next = head;

        ListNode* prev = dummy;

        while (prev->next != nullptr && prev->next->next != nullptr) {

            // Nodes to swap
            ListNode* first = prev->next;
            ListNode* second = first->next;

            // Swap nodes
            first->next = second->next;
            second->next = first;
            prev->next = second;

            // Move prev two nodes ahead
            prev = first;
        }

        return dummy->next;
    }
};