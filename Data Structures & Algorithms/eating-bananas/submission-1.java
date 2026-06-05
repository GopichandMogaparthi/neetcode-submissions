class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxPile =0;

        for(int pile : piles){
            maxPile = Math.max(maxPile, pile);
        }

        for(int k=1;k<=maxPile;k++){
            long hours = 0;
            for(int pile :piles){
                hours+=(pile+k-1)/k;

            }
            if(hours<=h){
                return k;
            }
        }
        return maxPile;
    }
}
