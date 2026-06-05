class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();

        if(digits == null || digits.length()==0){
            return result;
        }

        String[] map = { "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        result.add("");

        for(char digit : digits.toCharArray()){
            String letters = map[digit-'0'];
            List<String> temp = new ArrayList<>();
            for(String s : result){
                for(char c: letters.toCharArray()){
                    temp.add(s+c);
                }
            }
            result = temp;
        }
        return result;
    }
}
