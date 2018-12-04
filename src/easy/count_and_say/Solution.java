package easy.count_and_say;

import java.util.HashMap;

public class Solution {


    public static String countAndSay(int n) {
        String work = "";
        StringBuilder result = new StringBuilder();
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "1");
        map.put(2, "11");
        map.put(3, "21");
        map.put(4, "1211");
        map.put(5, "111221");
        if (map.containsKey(n)) return map.get(n);
        else work = map.get(5);
        for (int i = 0; i < n - 5; i++) {
            int k = 0;
            for (int j = 0; j < work.length();) {
                if (work.charAt(j) != work.charAt(k)) {
                    result.append(j - k).append(work.charAt(k));
                    k = j;
                } else if ((j == work.length() - 1) && (j >= k)) {
                    result.append(j - k + 1).append(work.charAt(j));
                }
                else j++;

            }
            work = result.toString();
            result = new StringBuilder();
        }
        return work;
    }


    public static void main(String[] args) {
        System.out.println(countAndSay(20));
    }

}
