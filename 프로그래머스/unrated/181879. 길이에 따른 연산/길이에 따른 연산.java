class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int len = num_list.length;
        
        // 배열의 길이가 11 이상이면 모든 원소의 합을 구하시오
        if (len >= 11) {
            for (int i = 0; i < len; i++) {
                answer += num_list[i];
            }
        // 배열의 길이가 11 보다 작다면 모든 원소를 곱하시오    
        } else {
            answer = 1;
            for (int i = 0; i < len; i++) {
                answer *= num_list[i];
            }
        }
        return answer;        
    }
}

// Refactoring
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int len = num_list.length;
        
        // 배열의 길이가 11 이상이면 모든 원소의 합을 구하시오
        if (len >= 11) {
            for (int i = 0; i < len; i++) {
                answer += num_list[i];
            }
        // 배열의 길이가 11 보다 작다면 모든 원소를 곱하시오    
        } else {
            answer = 1;
            for (int i = 0; i < len; i++) {
                answer *= num_list[i];
            }
        }
        return answer;        
    }
}
