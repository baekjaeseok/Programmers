class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int multi = 1;
        int plus = 0;
        for(int i = 0; i < num_list.length; i++) {
            multi *= num_list[i];
            plus += num_list[i];
        }
        
        if(multi < plus * plus) {
            answer = 1;
        } else {
            answer = 0;
        }

        return answer;
    }
}