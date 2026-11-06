class Solution {
    public int missingNumber(int[] nums) {

int xor_array = 0;
     for(int i=0 ; i<nums.length ; i++){
         xor_array ^= nums[i] ^ i;
     }
     xor_array ^= nums.length;
     return xor_array;
    }
}