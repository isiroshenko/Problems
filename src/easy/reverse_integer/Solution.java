package easy.reverse_integer;

class Solution {
    public static int reverseNew(int x) {
        int number;
        int result = 0;
        while (x != 0) {
            number = x % 10;
            x /= 10;
            result = result * 10 + number;
        }
        if ((x > Math.pow(2, 31) - 1) || (x < Math.pow(-2, 31))) return 0;
        return result;
    }

    public int reverse(int x) {
        String string = Integer.toString(x);
        StringBuilder result = new StringBuilder();
        long value;
        for (int i = string.length() - 1; i >= 0; i--) {
            result.append(string.charAt(i));
        }
        if (result.charAt(result.length() - 1) != '-') {
            value = Long.valueOf(result.toString());
        } else {
            value = Long.valueOf("-" + result.substring(0, result.length() - 1));
        }

        if ((value > Math.pow(2, 31) - 1) || (value < Math.pow(-2, 31))) return 0;
        else return (int) value;
    }

//class Solution {
// public int reverse(int x) {
//        double max = Math.pow(2, 31) - 1;
//        double min = Math.pow(-2, 31);
//        if ((x >  max) || (x < min)) return 0;
//        String string = Integer.toString(x);
//        StringBuilder result = new StringBuilder();
//        long value;
//        for (int i = string.length() - 1; i >= 0; i--) {
//            result.append(string.charAt(i));
//        }
//        if (result.charAt(result.length() - 1) != '-') {
//            value = Long.valueOf(result.toString());
//        } else {
//            value = Long.valueOf("-" + result.substring(0, result.length() - 1));
//        }
//
//        if ((value > max) || (value < min)) return 0;
//        else return (int)value;
//    }
//}

    //fastest solution
}