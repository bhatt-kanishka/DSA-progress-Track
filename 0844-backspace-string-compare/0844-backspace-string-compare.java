class Solution {
    public boolean backspaceCompare(String s, String t) {
        

        Stack<Character> stk1 = new Stack<>();
        Stack<Character> stk2 = new Stack<>();

        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i) == '#' ){
                if(!stk1.isEmpty()){
                stk1.pop();
                }
            }else{stk1.push(s.charAt(i));}
        }

         for(int j=0 ; j<t.length() ; j++){
            if(t.charAt(j) == '#'){
                if(!stk2.isEmpty()){
                stk2.pop();}
            }else{stk2.push(t.charAt(j));}
        }
        if(stk1.size() != stk2.size()){
            return false;
        }
       
             while(!stk1.isEmpty()){
                if(!stk1.pop().equals(stk2.pop())){
                 return false;
               
             
                }
        }
        return true;
    }

}