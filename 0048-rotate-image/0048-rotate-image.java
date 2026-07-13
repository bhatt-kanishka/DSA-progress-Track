class Solution {
    public void rotate(int[][] matrix) {
        
        int temp;

        for(int i=0 ; i<matrix.length ; i++){
            for(int j=i+1 ; j<matrix[0].length ; j++){

                temp = matrix[i][j];

                matrix[i][j] = matrix[j][i];
                   matrix[j][i] =  temp ;

            }
        }
 for(int i=0 ; i<matrix.length ; i++){

      int end = matrix.length-1;
        int start = 0;

    while(start <=end){
        temp = matrix[i][start];
        matrix[i][start] = matrix[i][end];
        matrix[i][end] = temp;
    
    start++;
    end--;
}
 }
    }
}