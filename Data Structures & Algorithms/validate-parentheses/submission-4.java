class Solution {
    public boolean isValid(String s) {

       //Optimized solution

       //Initialize the stack

       Deque<Character> stack = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            if(c=='(') stack.push(')');
            else if(c=='{') stack.push('}');
            else if(c=='[') stack.push(']');
        

        //Validate closing bracket

        else if(stack.isEmpty() || stack.pop() !=c){
            return false;
        }
        }
        return stack.isEmpty();

    }
}
