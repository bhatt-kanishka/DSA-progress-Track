class Solution {
    public int firstUniqChar(String s) {
        
        Stack<Character> stk = new Stack<>();
        Map<Character,Integer> mp = new HashMap<>();

        int freq = 1;

        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            mp.put(ch , mp.getOrDefault(ch , 0)+1);
        }

        for(int j=0 ; j<s.length() ; j++){
            if(mp.get(s.charAt(j)) == 1){
            return j;

            }
        }
        return -1;
    }
}