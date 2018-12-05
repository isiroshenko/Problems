package easy.length_of_last_word;

class Solution {
    public static int lengthOfLastWord(String s) {
        if(!s.contains(" ")) return s.length();
        if(s.length() == 1) return s.trim().length();
        int j = 0;
        for(int i = 0; i < s.length() - 1; i++){
            if((s.charAt(i) == ' ') && (s.charAt(i+1) != ' ')) j = i+1;
        }
        if(s.charAt(s.length() -1) == ' ') return s.substring(j, s.length() - 1).trim().length();
        else return s.substring(j).trim().length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("b   a   "));
    }
}