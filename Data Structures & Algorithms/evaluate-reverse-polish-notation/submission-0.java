class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for(String tok : tokens){
            if(tok.equals("+") || tok.equals("-") || tok.equals("*") || tok.equals("/")){
                int b = stack.pop();
                int a = stack.pop();

                int result;

                if(tok.equals("+")){
                    result = a+b;
                }
                else if(tok.equals("-")){
                    result = a-b;
                }
                else if(tok.equals("*")){
                    result = a*b;
                }
                else{
                    result = a/b;
                }

                stack.push(result);
            } 
            else{
                stack.push(Integer.parseInt(tok));
            }
        }
        return stack.pop();
    }
}
