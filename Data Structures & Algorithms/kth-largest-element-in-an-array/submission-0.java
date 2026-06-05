class Solution {
    public int findKthLargest(int[] nums, int k) {
        List<Integer> arr = new ArrayList<>();
        for(int num : nums){
            arr.add(num);
        }
        Collections.sort(arr);
        return arr.get(arr.size()-k);
        
    }
}
