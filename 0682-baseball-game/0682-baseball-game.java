class Solution {
    public int calPoints(String[] operations) {
        
        Stack<Integer> stk = new Stack<>();

        for(int i=0 ; i<operations.length ; i++){
            if(operations[i].equals("D")){
                stk.push(stk.peek() *2);
            }
            else if(operations[i].equals("C")){
                stk.pop();
            }
            else if(operations[i].equals("+")){
                int top = stk.pop();
                int sec = stk.peek();
                 stk.push(top);
                stk.push(top + sec );
               
            }else{
                stk.push(Integer.parseInt(operations[i]));
            }
        }
        int ans = 0;
        while(! stk.isEmpty()){
            ans += stk.pop();
        }
        return ans;
    }
}