class Solution {
    public int[] solution(int money) {
        int[] answer = {0,0};
        int ice_americano = 5500;
        int change = money-ice_americano*(money/ice_americano);
        
        if(money>0 && money<=1000000){
            answer[0] = money/ice_americano;
            answer[1] = change;
        }
        return answer;
        
    }
}