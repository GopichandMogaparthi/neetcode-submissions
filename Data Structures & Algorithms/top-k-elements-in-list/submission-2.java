class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        //Count Frequency
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        //Store unique elements
        List<Integer> list = new ArrayList<>(map.keySet());

        //Sort by frequency in descending order
        list.sort((a,b) -> map.get(b) - map.get(a));

        //Get top k elements
        int[] result = new int[k];
        for(int i =0;i<k;i++){
            result[i] = list.get(i);
        }
        return result;
    }
}
