package easy.plus_one;

public class Solution {

    public static int[] plusOne(int[] digits) {
        digits[digits.length - 1]++;
        for (int i = digits.length - 1; i > 0; i--) {
           if(digits[i] == 10) {
               digits[i] = 0;
               digits[i-1]++;
           }
        }
        if(digits[0] < 10) return digits;
        else {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            result[1] = 0;
            for (int i = 1; i < digits.length; i++){
                result[i+2] = digits[i];
            }
            return result;
        }
    }

    public static void main(String[] args) {
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        int[] result = plusOne(digits);
        for (int digit : result) {
            System.out.println(digit);
        }
    }
}

