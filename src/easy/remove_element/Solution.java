package easy.remove_element;

public class Solution {
//    public static int removeElement(int[] nums, int val) {
//        if (nums.length == 0) return 0;
//        int j = nums.length - 1;
//        int i = 0;
//        int length = nums.length;
//        while (i <= j) {
//            if ((nums[i] == val) && (nums[j] != val)) {
//                length--;
//                int temp = nums[i];
//                nums[i] = nums[j];
//                nums[j] = temp;
//                i++;
//                j--;
//            } else if ((nums[i] != val) && (nums[j] != val)) {
//                i++;
//            } else if (nums[j] == val) {
//                j--;
//            }
//        }
//        return i;
//    }

    // my solution


    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int ele : nums) {
            if (ele != val)
                nums[index++] = ele;
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 4, 5};
        int len = removeElement(nums, 1);
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
    }
}
