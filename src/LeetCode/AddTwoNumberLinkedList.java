package LeetCode;

//input:
//        [2,4,3]
//        [5,6,4]
//        [0]
//        [0]
//        [9,9,9,9,9,9,9]
//        [9,9,9,9]

//expected output:
//        [7,0,8]
//        [0]
//        [8,9,9,9,0,0,0,1]

public class AddTwoNumberLinkedList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = null;
        ListNode prev = null;
        ListNode start = null;

        int x = 0;
        int y = 0;
        int sum = 0;
        int rem = 0;

        while (l1 != null || l2 != null) {
            if (l1 != null) {
                x = l1.val;
                l1 = l1.next;
            } else {
                x = 0;
            }

            if (l2 != null) {
                y = l2.val;
                l2 = l2.next;
            } else {
                y = 0;
            }

            sum = x + y + rem;

            if (sum / 10 > 0) {
                rem = sum / 10;
                sum = sum % 10;
            } else {
                rem = 0;
            }

            res = new ListNode(sum);
            if (prev == null) {
                prev = res;
                start = res;
            } else {
                prev.next = res;
                prev = res;
            }
        }

        if (rem > 0) {
            res = new ListNode(rem);
            prev.next = res;
        }

        return start;
    }

    public static void main(String[] args) {
        AddTwoNumberLinkedList addTwoNumberLinkedList = new AddTwoNumberLinkedList();

//        addTwoNumberLinkedList.addTwoNumbers()
    }
}
