class Solution {
    public boolean isValid(String s) {

        /*
            The idea is simple

            valid parentheses must always appear in matching pairs like

            "()" "{}" "[]"

            so if the string is valid, we can repeatedly remove these
            matching pairs until nothing is left

            if after removing all possible pairs, the string becomes 
            empty, then the parentheses were properly mathched

            otherwise, some unmatched characters remain, meaning the string 
            is invalid

        */

        /*

        Algorithm : 

        1. While the string still contains "()", "{}", "[]"
            - Remove all occurences of those pairs

        2. After no more pairs can be removed 

            - If the string is empty, return true
            - Otherwise, return false



        */

        while(s.contains("()") || s.contains("{}") || s.contains("[]")){
            s = s.replace("()","");
            s = s.replace("[]","");
            s = s.replace("{}","");
        }
        return s.isEmpty();
    }
}
