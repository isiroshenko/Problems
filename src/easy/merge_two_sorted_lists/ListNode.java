package easy.merge_two_sorted_lists;


public class ListNode {
    public int val;       // data stored in this node
    public ListNode next;  // link to next node in the list

    // post: constructs a node with data 0 and null link
    public ListNode() {
        this(0, null);
    }

    // post: constructs a node with given data and null link
    public ListNode(int val) {
        this(val, null);
    }

    // post: constructs a node with given data and given link
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
