class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        double sum = 0.0;
        double div = num1/num2;
        if(num1>0 && num1<=100){
            if(num2>0 && num2<=100){
                sum = div * 1000.0;
            }
        }
        answer = (int)sum;
        return answer;
    }
    
    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.solution(3,2));
    }
}