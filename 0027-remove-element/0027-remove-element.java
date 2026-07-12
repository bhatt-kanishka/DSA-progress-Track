class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
       
        int j= nums.length-1;
        while(i<=j){
            if(nums[i]!=val){
                i++;
            }else if(nums[j]==val && nums[i]==val){
                j--;
                }else{
                    nums[i]=nums[j];
                    i++;
                    j--;
               
                }
            }
        
    return i;
    }
}

public class Main{
   public static void main(String[] ms){
    Solution obj = new Solution();

    int[] nums = {3 , 2, 2 , 3};
    int val = 3 ;

   }
}