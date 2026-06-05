class Solution {
    public List<List<Integer>> permute(int[] nums) {

        /* Given an array nums of unique integers - no duplicates
        Return all possible permutations. 
        Condition : return answer in any order

        Constraints

        1<=nums.length<=6
        -10<=nums[i]<=10

        Declare a result of data type List<List<Integer> 

        Declare a temp for storing the list of permutation

        then add it to result

        Pick one element make the combination of that initial element
        Pick second element set it to position 1 / index 0 make the combination
        and repeat 


        */

        List<List<Integer>> result = new ArrayList<>();

        boolean[] used = new boolean[nums.length];

        backtrack(nums, new ArrayList<>(), used, result);

        return result;
        
    }

    public static void backtrack(int[] nums, List<Integer> temp, boolean[] used, List<List<Integer>> result){
        //Base case if lengths are qual

        if(temp.size()==nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }

        for(int i =0;i<nums.length;i++){
            if(used[i]){
                continue;
            }
            temp.add(nums[i]);
            used[i] = true;

            backtrack(nums,temp,used,result);

            temp.remove(temp.size()-1);
            used[i]=false;
        }
    }
}
