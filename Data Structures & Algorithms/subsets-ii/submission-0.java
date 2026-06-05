class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        /*

        Subset

        Given an array of nums of integers

        which may contain duplicates 

        return all possible subsets

        Subset of set can defined as element should be present if and 
        only if all elements present in A

        let' say set A = [1,2,3]

        subsets [],[1],[2],[3],[1,2],[1,3],[2,3],[1,2,3]

        Declare result of dat type  Lits<List<Integer> 
        Base case : Universal empty set is a subset of itself and set
        add it to list

        then take each element is a subset of set

        add everything to the List 

        and take two combination and add it to the list 

        and take three combination and add it to the lsit

        and so on until you reach the array length

        and last possible subset is the given array itself




        */
        //sort to bring duplicates together
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        //empty set is always a subset
        backtrack(0, nums, temp, result);

        return result;

        
    }
    private void backtrack(int start, int[] nums, List<Integer> temp, List<List<Integer>> result){
        result.add(new ArrayList<>(temp));

        for(int i = start; i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1]) continue;

            //choose
            temp.add(nums[i]);

            //explore
            backtrack(i+1, nums, temp, result);

            //backtrack
            temp.remove(temp.size()-1);
        }
    }
}