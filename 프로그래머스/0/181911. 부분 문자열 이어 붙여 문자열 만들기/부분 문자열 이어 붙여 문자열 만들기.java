class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        for (int i=0; i<parts.length; i++) {
            my_strings[i] = my_strings[i].substring(parts[i][0], parts[i][1]+1);
        }
        StringBuilder sb = new StringBuilder();
        for (String s : my_strings) {
            sb.append(s);
        }
        answer = sb.toString();
        return answer;
    }
}