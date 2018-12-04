package easy.select_insert_position;

public class Solution {
    public static int searchInsert(int[] nums, int target) {
        int position = 0;
        for (int i = 0; i < nums.length; i++) {
            if (target > nums[i]) position++;

        }
        return position;
    }

    // as well we can do like that
//    public static int searchInsert(int[] nums, int target) {
//        int i;
//        for(i = 0; i < nums.length; i++){
//            if(target <= nums[i]) return i;
//
//        }
//        return i;
//    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5, 6};
        System.out.println(searchInsert(nums, 7));
    }
}
