class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = num_list[i];
        }        
        return answer;
    }
}

// Refactoring
class Solution {
    public String solution(String my_string, int n) {
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < n; i++) {
            char c = my_string.charAt(i);
            sb.append(c);
        }
        return sb.toString();
    }
}
