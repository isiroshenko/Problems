package easy.roman;

import java.util.HashMap;
import java.util.Map;

class Solution {
//    public static int romanToInt(String s) {
//        int number = 0;
//        Map<Character, Integer> map = new HashMap<>();
//        map.put('I', 1);
//        map.put('V', 5);
//        map.put('X', 10);
//        map.put('L', 50);
//        map.put('C', 100);
//        map.put('D', 500);
//        map.put('M', 1000);
//
//        for (int i = 0; i < s.length(); i++) {
//            if (s.length() == 1) return map.get(s.charAt(i));
//            if ((s.length() - i > 1) && (s.charAt(i) == 'I') && ((s.charAt(i + 1) == 'V') || (s.charAt(i + 1) == 'X'))) {
//                number += map.get(s.charAt(i + 1)) - map.get('I');
//                i++;
//            } else if (s.charAt(i) == 'I') {
//                number += map.get('I');
//            } else if ((s.length() - i > 1) && (s.charAt(i) == 'X') && ((s.charAt(i + 1) == 'L') || (s.charAt(i + 1) == 'C'))) {
//                number += map.get(s.charAt(i + 1)) - map.get('X');
//                i++;
//            } else if (s.charAt(i) == 'X') {
//                number += map.get('X');
//            } else if ((s.length() - i > 1) && (s.charAt(i) == 'C') && ((s.charAt(i + 1) == 'D') || (s.charAt(i + 1) == 'M'))) {
//                number += map.get(s.charAt(i + 1)) - map.get('C');
//                i++;
//            } else if (s.charAt(i) == 'C') {
//                number += map.get('C');
//            } else if (s.charAt(i) == 'V') {
//                number += map.get('V');
//            } else if (s.charAt(i) == 'L') {
//                number += map.get('L');
//            } else if (s.charAt(i) == 'D') {
//                number += map.get('D');
//            } else if (s.charAt(i) == 'M') {
//                number += map.get('M');
//            }
//        }
//        return number;
//    }

    public static int romanToInt(String s) {
        if (s.length() == 0 || s.isEmpty()) return -1;
        int length = s.length();
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        //if (s.length() == 1) return map.get(s.charAt(0));
        int result = map.get(s.charAt(length - 1));
        for (int i = s.length() - 2; i >= 0; i--) {
            if (map.get(s.charAt(i + 1)) > map.get(s.charAt(i))) {
                result -= map.get(s.charAt(i));
            } else {
                result += map.get(s.charAt(i));
            }
        }
        return result;
    }

//    public static int romanToInt(String s) {
//            if (s == null
//                    || s.isEmpty()) {
//                return 0;
//            }
//
//            int result = 0;
//            for (int i = s.length() - 1; i >= 0; i--) {
//                switch (s.charAt(i)) {
//                    case 'I':
//                        result += result >= 5 ? -1 : 1;
//                        break;
//                    case 'V':
//                        result += 5;
//                        break;
//                    case 'X':
//                        result += result >= 50 ? -10 : 10;
//                        break;
//                    case 'L':
//                        result += 50;
//                        break;
//                    case 'C':
//                        result += result >= 500 ? -100 : 100;
//                        break;
//                    case 'D':
//                        result += 500;
//                        break;
//                    case 'M':
//                        result += 1000;
//                        break;
//                    default:
//                        throw new IllegalArgumentException();
//                }
//            }
//
//            return result;
//        }

    public static void main(String[] args) {
        System.out.println(romanToInt("I"));
    }
}

