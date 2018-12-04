package easy.implement_str;

class Solution {
    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        System.out.println(strStr("hello", "llss"));
    }
}