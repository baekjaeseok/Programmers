class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String strA = Integer.toString(a);
        String strB = Integer.toString(b);
        
        String sum = strA + strB;
        int result = Integer.parseInt(sum);
        
        if (result > 2 * a * b) {
            answer = result;
        } else {
            answer = 2 * a * b;
        }

        return answer;
    }
}