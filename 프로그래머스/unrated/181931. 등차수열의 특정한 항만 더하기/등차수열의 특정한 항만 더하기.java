class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int n = included.length;
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = a + d * i;
            
            if(included[i] == true) {
                answer += arr[i];
            }
        }
        
        return answer;
        
    }
}