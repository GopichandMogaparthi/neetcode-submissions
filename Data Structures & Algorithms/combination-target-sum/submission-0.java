class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {

        /*

        Given an array of distinct integers - different
        and a target integer tsrget
        return a list of unique combination of nums to make the sum target

        The same number can be choosen from nums an unlimited number of times

        Two combinations are the sam if the frequency of each of choosen numbers is the dame 
        otherwise they are different 


        pick an element check if it equal to target
            and keep the first and pick second do sum first and second check equals to target
            and so on until reaches the sum
        backtrack and repeat the same element from starting and remaining elements

        so add the list temp individua;l;y and finally add it to the result

        */

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(0, target, nums, new ArrayList<>(), result);
        return result;
        
    }
    public static void backtrack(int start, int remain,int[] nums,
    List<Integer> temp, List<List<Integer>> result){
        if(remain==0){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<nums.length;i++){
            int val = nums[i];
            if(val>remain){
                break;
            }
            temp.add(val);
            backtrack(i, remain-val, nums, temp, result);
            temp.remove(temp.size()-1);
        }
    }
}
