package easy.parentheses;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid("{(}}"));
    }
    //Smoker's solution


//    //Human's solution
//    private HashMap<Character, Character> mappings;
//
//
//    public Solution() {
//        this.mappings = new HashMap<>();
//        this.mappings.put(')', '(');
//        this.mappings.put('}', '{');
//        this.mappings.put(']', '[');
//    }

//    public boolean isValid(String s) {
//
//        Stack<Character> stack = new Stack<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (this.mappings.containsKey(c)) {
//                char topElement = stack.empty() ? '#' : stack.pop();
//                if (topElement != this.mappings.get(c)) {
//                    return false;
//                }
//            } else {
//                stack.push(c);
//            }
//        }
//        return stack.isEmpty();
//    }
//
//    //Top level solution
//    public boolean isValid(String s) {
//        if (s == null || s.length() == 0) return false;
//        int top = -1;
//        char[] stack = new char[s.length()];
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            switch (c) {
//                case ')':
//                    if ((top == -1) || (stack[top] != '(')) return false;
//                    top--;
//                    break;
//                case ']':
//                    if ((top == -1) || (stack[top] != '[')) return false;
//                    top--;
//                    break;
//                case '}':
//                    if ((top == -1) || (stack[top] != '{')) return false;
//                    top--;
//                    break;
//                case '(':
//                case '[':
//                case '{':
//                    stack[++top] = c;
//            }
//        }
//        return top == -1;
//    }

    public boolean isValid(String s) {
        //boolean result = false;
        if (s.isEmpty()) return true;
        if ((s.length() % 2 != 0)) return false;
        while ((s.contains("[]")) || (s.contains("{}")) || (s.contains("()"))) {
            if (s.contains("[]")) {
                s = s.replace("[]", "");
                // result = true;
            }
            if (s.contains("{}")) {
                s = s.replace("{}", "");
                //result = true;
            }
            if (s.contains("()")) {
                s = s.replace("()", "");
                //result = true;
            }
        }
        return s.isEmpty();
//        LOOP:
//        for (int i = 0; i < s.length() / 2; ) {
//            int j = i + 1;
//            while (j < s.length()) {
//                if ((((s.charAt(i) == '(')) && (s.charAt(j) == ')'))
//                        || (((s.charAt(i) == '[')) && (s.charAt(j) == ']'))
//                        || (((s.charAt(i) == '{')) && (s.charAt(j) == '}'))) {
//                    s = s.substring(1, j) + s.substring(j + 1);
//                    result = true;
//                    continue LOOP;
//                } else {
//                    j = j + 2;
//                    if (j >= s.length()) result = false;
//                }
//            }
//            if (!result) return false;
//        }
        //return result;
    }

}


