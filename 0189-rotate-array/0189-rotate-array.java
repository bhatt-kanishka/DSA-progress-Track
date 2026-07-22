class Solution {
    public void rotate(int[] nums, int k) { 
       
       k = k%nums.length;
       
        int i=0;
        int j=nums.length-1;
        int temp = 0;
        while(i<j){
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }

        int st=0;
        int end=k-1;
        while(st<end){
            temp = nums[st];
            nums[st] = nums[end];
            nums[end] = temp;
            st++;
            end--;
        }

        int sec=k;
        int last=nums.length-1;
        
        while(sec<last){
            temp = nums[sec];
            nums[sec] = nums[last];
            nums[last] = temp;
            sec++;
            last--;
        }

    }
}