class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if (s.length() == 4 | s.length() == 6) {
            char[] charAry = s.toCharArray();
            for (char c : charAry) {
                if (!Character.isDigit(c)) {
                    answer = false;
                }
            }

        } else {
            answer = false;
        }
        return answer;
    }
}