class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        String[] strAry = my_string.split("");
        for (int i : index_list) {
            answer += strAry[i];
        }
        return answer;
    }
}