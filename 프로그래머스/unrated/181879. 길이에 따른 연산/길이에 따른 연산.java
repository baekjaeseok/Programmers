class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int len = num_list.length;
        int sum = 0;
        int multiply = 1;
        
        // 배열의 길이가 11 이상이면 모든 원소의 합을 구하시오
        if (len >= 11) {
            for (int i = 0; i < len; i++) {
                sum += num_list[i];
                answer = sum;
            }
        // 배열의 길이가 11 보다 작담녀 모든 원소를 곱하시오    
        } else {
            for (int i = 0; i < len; i++) {
                multiply *= num_list[i];
                answer = multiply;
            }
        }
        return answer;        
    }
}