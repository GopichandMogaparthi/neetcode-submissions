class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        /*
        Given an array of nums of unique integers - no duplicates
        Return all possible subsets of nums
        The solution set must not contain duplicate subsets.
        Return the solution in any order



        Declare a result of data type List<List<Integer> 
        And do back tracking

        Base case : Empty set is a subset of itself and all sets

        Declare temp of data type List<Integer>
        pick an element it is a subset of set add it to  temp and result
            keep same element and try all combination two elements add it to temp and result
        and soon and keep repeating.



        */

        List<List<Integer>> result = new ArrayList<>();

        backtrack(0, nums, new ArrayList<>(), result);

        return result;
        
    }
    public static void backtrack(int start, int[] nums, List<Integer> temp, List<List<Integer>> result){

        result.add(new ArrayList<>(temp));
        for(int i=start;i<nums.length;i++){
            temp.add(nums[i]);
            backtrack(i+1,nums, temp, result);
            temp.remove(temp.size()-1);
        }
    }
}
