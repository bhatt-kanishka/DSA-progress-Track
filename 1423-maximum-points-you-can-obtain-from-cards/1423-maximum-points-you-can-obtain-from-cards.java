class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        int rsum = 0;
        int right  = cardPoints.length-1;
        int lsum = 0;

        int maxsum = 0;

        for(int i=0 ; i<=k-1 ; i++){
            lsum += cardPoints[i];
            maxsum = lsum;
        }

        for(int i=k-1 ; i>=0 ; i--){
            lsum = lsum - cardPoints[i];

            rsum = rsum + cardPoints[right];
            right--;

            maxsum = Math.max(maxsum, lsum+rsum);
        }
        return maxsum;
    }
}