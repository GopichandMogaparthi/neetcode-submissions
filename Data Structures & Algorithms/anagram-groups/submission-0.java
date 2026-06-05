class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();

        //Step 1 : Count characters manually
        for(String s : strs){
            int[] count = new int[26];
            for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                count[ch-'a']++;
            }
        

        //Step 2 : Build a unique key from counts
        StringBuilder keyBuilder = new StringBuilder();
        for(int i=0;i<26;i++){
            keyBuilder.append('#');
            keyBuilder.append(count[i]);
        }

        String key = keyBuilder.toString();

        //Step 3 : Group Anagrams
        if(!map.containsKey(key)){
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(s);

        //Step 4 : return result
        }
    return new ArrayList<>(map.values());
}
    }

    
