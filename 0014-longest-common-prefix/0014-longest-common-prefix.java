class Solution {
    public String longestCommonPrefix(String[] strs) {
        String new_seq = "";

        if(strs == null ){
            return new_seq;
        }

        for(int i=0 ; i<strs[0].length(); i++){

           for(int j=0 ; j<strs.length ; j++){

                
                if(i >= strs[j].length()){
                    return new_seq ;
                }

                if(strs[0].charAt(i) != strs[j].charAt(i)){
                    return new_seq ;
           }
             
           }

           new_seq += strs[0].charAt(i);
        }
         return new_seq;
}
}