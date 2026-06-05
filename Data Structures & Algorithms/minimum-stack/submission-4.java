class MinStack {

    /*

    Intuition : 

    Instead of searching the whole stack to find the minimum everytime,

    we can keep a second stack that always store the minimum value up 
    to that point.

    So whenever we push a new value, we compare it with the current minimum 
    and store the smaller one on the minStack

    This guarantees that the top of minStack is always the minimum of the
    entire stack - allowing getMin() to work in constan time

    */

    /*

    Algorithm : 

    1. Maintain two stacks : 
        * stack -> stores all pushed values
        * minStack -> stores the minimum so far at each level.

    2. On push(val) :
        * Push val onto stack.
        * Compute the new minimum (between val and the current minimum on 
        minStack)
        * Push this minimum onto minStack.

        3. On pop() : 
            * Pop from both stack and minStack to keep them aligned
        
        4. On top() :
            * Return the top of stack
        5. On getMin() :
            * Return the top of minStack, which is the current minimum.


    */

    private Stack<Integer> stack;
    private Stack<Integer> minStack;


    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {

        stack.push(val);
        if(minStack.isEmpty() || val<=minStack.peek()){
            minStack.push(val);
        }
        
    }
    
    public void pop() {
        if(stack.isEmpty()) return;
        int top = stack.pop();
        if(top==minStack.peek()){
            minStack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
