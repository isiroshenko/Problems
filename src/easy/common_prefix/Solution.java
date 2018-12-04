package easy.common_prefix;

class Solution {
//    public static String longestCommonPrefix(String[] strs) {
//        if (strs.length == 0) return "";
//        String first = strs[0];
//        if (strs.length == 1) return first;
//
//        String prefix = "";
//        for (int j = 0; j < first.length(); ) {
//            int counter = 0;
//            for (int i = 1; i < strs.length; i++) {
//                if ((strs[i].length()) == j) break;
//                if (strs[i].isEmpty()) return "";
//                if (strs[i].charAt(j) == first.charAt(j)) {
//                    counter++;
//                } else break;
//
//            }
//            if ((strs.length - 1) == counter) {
//                prefix += first.charAt(j);
//                j++;
//            } else break;
//        }
//        return prefix;
//    }
//
//    public static String longestCommonPrefix(String[] strs) {
//        if (strs.length == 0) return "";
//        if (strs.length == 1) return strs[0];
//        String smallest = strs[0];
//        StringBuilder prefix = new StringBuilder();
//        for (String str : strs) {
//            if (str.isEmpty()) return "";
//            if (smallest.length() > str.length()) smallest = str;
//        }
//        int counter = 0;
//        for (int i = 0, j = 0; i < strs.length;) {
//            if(j > smallest.length()-1) return prefix.toString();
//            if (strs[i].charAt(j) == smallest.charAt(j)) {
//                counter++;
//            }
//            i++;
//            if (counter == strs.length) {
//                prefix.append(smallest.charAt(j));
//                j++;
//                i = 0;
//                counter = 0;
//            }
//        }
//        return prefix.toString();
//    }

//    public static String longestCommonPrefix(String[] strs) {
//        if(strs == null || strs.length == 0)
//            return "";
//        String prefix = strs[0];
//        for(int i = 1; i < strs.length; i++){
//            while(strs[i].indexOf(prefix) != 0){
//                prefix = prefix.substring(0, prefix.length() - 1);
//            }
//            if(prefix.length() == 0)
//                return "";
//        }
//        return prefix;
//    }

//    public static String longestCommonPrefix(String[] strs) {
//        if (strs == null || strs.length == 0) return "";
//        for (int i = 0; i < strs[0].length() ; i++){
//            char c = strs[0].charAt(i);
//            for (int j = 1; j < strs.length; j ++) {
//                if (i == strs[j].length() || strs[j].charAt(i) != c)
//                    return strs[0].substring(0, i);
//            }
//        }
//        return strs[0];
//    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        return longestCommonPrefix(strs, 0, strs.length - 1);
    }

    private static String longestCommonPrefix(String[] strs, int l, int r) {
        if (l == r) {
            return strs[l];
        } else {
            int mid = (l + r) / 2;
            String lcpLeft = longestCommonPrefix(strs, l, mid);
            String lcpRight = longestCommonPrefix(strs, mid + 1, r);
            return commonPrefix(lcpLeft, lcpRight);
        }
    }

    static String commonPrefix(String left, String right) {
        int min = Math.min(left.length(), right.length());
        for (int i = 0; i < min; i++) {
            if (left.charAt(i) != right.charAt(i))
                return left.substring(0, i);
        }
        return left.substring(0, min);
    }


    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }

}
