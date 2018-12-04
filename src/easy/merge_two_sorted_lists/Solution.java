package easy.merge_two_sorted_lists;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        listNode.next = listNode1;
        listNode1.next = new ListNode(7);
        ListNode listNode3 = new ListNode(1);
        ListNode listNode4 = new ListNode(4);
        listNode3.next = listNode4;
        listNode4.next = new ListNode(5);
        solution.mergeTwoLists(listNode, listNode3);
    }

    //    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        if (l1 == null) return l2;
//        if (l2 == null) return l1;
//        List<ListNode> listNodes = new ArrayList<>();
//        while (l1.next != null) {
//            listNodes.add(new ListNode(l1.data));
//            l1 = l1.next;
//        }
//        listNodes.add(new ListNode(l1.data));
//        while (l2.next != null) {
//            listNodes.add(new ListNode(l2.data));
//            l2 = l2.next;
//        }
//        listNodes.add(new ListNode(l2.data));
//        listNodes.sort(Comparator.comparingInt(listNode -> listNode.data));
//        for (int i = listNodes.size() - 1; i > 0; i--) {
//            listNodes.get(i - 1).next = listNodes.get(i);
//        }
//        return listNodes.get(0);
//    }
// my solution
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}
