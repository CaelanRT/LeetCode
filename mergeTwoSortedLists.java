/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergedList = null;
        ListNode current = null;
        ListNode currentListTwo = null;
        ListNode temp = null;
        ListNode list2next = null;

        if (list1 == null) {
            mergedList = list2;
            return mergedList;
        }

        mergedList = list1;
        

        while (list2 != null) {
            current = mergedList;
            currentListTwo = list2;
            list2next = list2.next;
            while (mergedList != null) {
                //add to front case
                if (currentListTwo.val < current.val) {
                    currentListTwo.next = current;
                    mergedList = currentListTwo;
                    break;
                } else if (currentListTwo.val == current.val){
                    temp = current.next;
                    current.next = currentListTwo;
                    currentListTwo.next = temp;
                    break;
                } else if (current.next == null) {
                    current.next = currentListTwo;
                    currentListTwo.next = null;
                } else if (currentListTwo.val > current.val && currentListTwo.val < current.next.val) {
                    temp = current.next;
                    current.next = currentListTwo;
                    currentListTwo.next = temp;
                    break;
                }

                current = current.next;
            }
            list2 = list2next;
        }

        return mergedList;



    }
}
