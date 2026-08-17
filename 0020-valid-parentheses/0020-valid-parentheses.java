import java.util.ArrayDeque;
import java.util.Stack;


class Solution {
public boolean isValid(String s){
        Stack<Character> obj = new Stack<>();

        for(int i=0; i<s.length(); i++){

            char ch = s.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){
                obj.push(ch);
            }
            
else{
         if(obj.isEmpty()) return false;
               
        
         else if(ch == ')'  && obj.peek() == '(' || ch == '}'  && obj.peek() == '{' || ch == ']'  && obj.peek() == '['){
                obj.pop();
        }
            else return false;
            

        }
        }
return obj.isEmpty();
    }
}