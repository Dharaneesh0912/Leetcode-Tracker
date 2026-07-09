// Last updated: 7/9/2026, 3:09:38 PM
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {

        // Dummy node handles removing the head node
        ListNode* dummy = new ListNode(0);
        dummy->next = head;

        ListNode* fast = dummy;
        ListNode* slow = dummy;

        // Move fast pointer n steps ahead
        for (int i = 0; i < n; i++) {
            fast = fast->next;
        }

        // Move both pointers until fast reaches last node
        while (fast->next != nullptr) {
            fast = fast->next;
            slow = slow->next;
        }

        // Remove nth node from end
        ListNode* temp = slow->next;
        slow->next = slow->next->next;

        delete temp;

        return dummy->next;
    }
};