class Solution {
    public boolean isPalindrome(int x) {
        int original_no =x;
        int reverse_no = 0;

        if(x<0)  return false;
          //  System.out.println("negative numbers are not palindrome");
        
        

        while(x!=0){
            int rem = x%10;
            reverse_no = reverse_no * 10 + rem;
            x=x/10;
}
if(original_no == reverse_no){
    return true;
}else{
    return false;
}
       
}}

public class Main{
    public static  final void main(String[] args){
        Solution obj = new Solution();
            int x = 1298921;

            System.out.println(obj.isPalindrome(x));
        }
    }
