class Solution {
    public int longestConsecutive(int[] nums) {
 
        int count = 1;
        int maxlong = 1;
        Arrays.sort(nums);


        if(nums.length == 0) return 0;
        
        for( int i=0 ; i<nums.length-1 ; i++){
            if(( nums[i]+1 ) == nums[i+1]){
                count++;

                maxlong = Math.max(count , maxlong);
            }
           else if(nums[i] == nums[i+1]) continue;

            else count = 1;
          
        }
    return maxlong;
    }
}