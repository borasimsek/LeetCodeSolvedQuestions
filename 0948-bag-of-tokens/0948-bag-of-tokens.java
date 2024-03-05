class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int l = 0, r = tokens.length-1;
        int score = 0 , maxScore = 0;
        while(l<=r){
            if(power >=tokens[l]){
                power = power - tokens[l];
                l++;
                score++;
                maxScore = Math.max(maxScore,score);
            }else if(score > 0){
                power += tokens[r];
                r--;
                score --;
            }else{
                break;
            }
        }
        return maxScore;
        
    }
}