class Solution {
    public int[] twoSum(int[] numbers, int target) {
        /*

        Given array of integers : numbers 
        It is sorted in non-decreasing order small to big

        return the indices of two number such that 
        sum is equal to target number : target

       Condition :  index1 < index2
        index1 and index 2 cannot be equal 

        Exactly one valid solution




        */
        for(int i =0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==target){
                    return new int[]{i+1,j+1};
                }
            }
        }
        return new int[0];
    }
}
