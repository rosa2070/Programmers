class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};

        for (int i=0; i<strArr.length; i++) {
            strArr[i] = (i % 2 == 0) ? strArr[i].toLowerCase() : strArr[i].toUpperCase();
        }
        
        answer = strArr;
        return answer;
    }
}