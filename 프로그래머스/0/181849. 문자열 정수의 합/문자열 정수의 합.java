class Solution {
    public int solution(String num_str) {
        int answer = 0;
        char[] charAry = num_str.toCharArray();
        for (char c : charAry) {
            answer += Character.getNumericValue(c);
        }
        return answer;
    }
}