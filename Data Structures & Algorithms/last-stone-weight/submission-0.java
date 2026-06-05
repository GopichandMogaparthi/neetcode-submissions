class Solution {
    public int lastStoneWeight(int[] stones) {

        /*

        Given an array of integers stones where stone[i] are
        weight of ith stone

        Two heaviest stone with height x and y and smash

        x=y stones are destroyed weight =0
        if x<y the stone of weight x is destroyed and the stone of weight y has 
        new weight y-x

        Continue the simulation until there is no more than one stone remianinng

        Return the weight of the last remaining stone or return o if none remain

        Initially you need to sort the elements and add to list


         pick last two elements if equal destroy
         if not make difference add it last position of list

         and repeat the task until it reaches single element 




        */

        int n = stones.length;

        while(n>1){
            Arrays.sort(stones,0,n);
            int y = stones[n-1];
            int x = stones[n-2];
            if(x==y){
                n=n-2;
            }
            else{
                stones[n-2]=y-x;
                n=n-1;
            }
        }
        return n-1==0 ? stones[0] : 0;
    }
}
