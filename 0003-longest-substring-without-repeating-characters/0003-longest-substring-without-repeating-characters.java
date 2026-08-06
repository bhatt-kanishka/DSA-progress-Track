class Solution {
    public int lengthOfLongestSubstring(String s) {
     HashMap<Character, Integer> obj = new HashMap<>();
     
     int left = 0;
    // int right = 0;
     int curr = 0;
     int max_length = 0;

     for(int right=0 ; right<s.length() ; right++){
       
       if(obj.containsKey(s.charAt(right))){
       left = Math.max(left, obj.get(s.charAt(right)) + 1);
       }
        obj.put(s.charAt(right), right);
        

       
        curr = right - left  +1;
;
         max_length = Math.max(max_length,curr);
        
       
     }
     return max_length;
    }}
