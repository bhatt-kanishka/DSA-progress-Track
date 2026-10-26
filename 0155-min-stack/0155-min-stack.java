class MinStack {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int value) {
        s1.push(value);

        if(s2.isEmpty() ||value <= s2.peek()){
        s2.push(value);
        }
    }
    
    public void pop() {
      int val =  s1.pop();

      if(s2.peek() == val){
        s2.pop();
      }
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        return s2.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */