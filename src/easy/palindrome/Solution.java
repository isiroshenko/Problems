package easy.palindrome;

class Solution {
//    public static boolean isPalindrome(int x) {
//        String string = Integer.toString(x);
//        boolean result = false;
//        int i = 0;
//        int length = string.length();
//        if (length == 1) return true;
//        else if (length == 2) {
//            return string.charAt(0) == string.charAt(1);
//            }
//        else{
//            while (i < (length - 1) / 2) {
//                result = string.charAt(i) == string.charAt(string.length() - 1 - i);
//                if (!result) return result;
//                i++;
//            }
//        }
//        return result;
//    }

//    public static boolean isPalindrome(int x) {
//        String s = Integer.toString(x);
//        StringBuilder stringBuilder = new StringBuilder();
//        for(int i = s.length()-1; i >= 0; i--){
//            stringBuilder.append(s.charAt(i));
//        }
//        return Integer.valueOf(stringBuilder.toString()) == x;
//    }


    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        if ((x < 10) || (x % 10 == 0)) return true;
        long number = 0;
        while (number < x) {
            number = number * 10 + x % 10;
            x /= 10;
        }
        return x == number || x == number / 10;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(0));
    }

}
