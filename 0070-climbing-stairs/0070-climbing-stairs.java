class Solution {
    public int climbStairs(int n) {

     int first = 1;
     int sec = 2   ;

     if(n<=2){
        return n;
     }
     for(int i=2 ; i<n ; i++){
        int fibbo = first + sec;
        first = sec;
        sec = fibbo;
     }
     
     return sec;
    }
}