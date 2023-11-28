class Solution {
    public int solution(int a, int b) {

        String num1 = Integer.toString(a);
        String num2 = Integer.toString(b);
        
        int result1 = Integer.parseInt(num1 + num2);
        int result2 = Integer.parseInt(num2 + num1);
        
        if(result1 > result2) {
            return result1;
        } else {
            return result2;
        }
        
    }
}