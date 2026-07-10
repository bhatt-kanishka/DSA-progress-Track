class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> result = new ArrayList<>();

        int top = 0;
        int left = 0;
        int right = matrix[0].length-1;
        int bottom = matrix.length-1;

        while(left <= right && top <= bottom){

            for(int j=left ;j<=right ; j++){
                result.add(matrix[top][j]);
            }
            top++;

            for(int i=top ; i<=bottom ; i++){
                result.add(matrix[i][right]);
            }
           right--;

            if(top<=bottom){
           for(int k=right ; k>=left ;k--){
            result.add(matrix[bottom][k]);
           }
           bottom--;
            }

            if(right>=left){
           for(int v=bottom ;v>=top ;v--){
                result.add(matrix[v][left]);
           }
           left++;
            }
}
        
        return result;
    }
}