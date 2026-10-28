class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Map<Integer , Integer> mp = new HashMap<>();
        Stack<Integer > stk = new Stack<>();

        for(int i=0 ; i<nums2.length; i++){
           while(!stk.isEmpty()  && nums2[i]>stk.peek()){
              mp.put(stk.pop(), nums2[i]);  
              }

                stk.push(nums2[i]);
        }
         while(!stk.isEmpty()){
            mp.put(stk.pop() , -1);
         }
              
            
            int[] ans = new int[nums1.length];
            for(int i =0 ; i<nums1.length ; i++){
                ans[i] = mp.get(nums1[i]);
            }
        
        return ans;
    }}
