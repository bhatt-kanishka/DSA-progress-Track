class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int[] arr = new int[temperatures.length];
        Stack<Integer> stk = new Stack<>();
        int start = 0;

        for(int i=0 ; i<temperatures.length ; i++){

            while(!stk.isEmpty() && temperatures[stk.peek()] < temperatures[i]){
                int prev = stk.pop();
                arr[prev] = i - prev;
            }
            stk.push(i);
              
            }
        
        
        return arr;
    }
}