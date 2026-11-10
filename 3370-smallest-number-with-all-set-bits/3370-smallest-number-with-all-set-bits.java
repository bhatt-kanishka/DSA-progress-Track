class Solution {
    public int smallestNumber(int n) {
        String intobinary = "";

        while(n != 0){
            int rem = n%2;
            intobinary += rem;
            n = n/2;
        }
        int k = intobinary.length();
        int ans = (int)Math.pow(2 , k) -1;

        return ans;
    }
}