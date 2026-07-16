class Solution {
    public int[][] transpose(int[][] matrix) {
        if(matrix==null||matrix.length==0){
            return new int[0][0];
        }
        //original array lengths
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        //new array creation
        int newRowLength = colLength;
        int newColLength = rowLength;
         int [][] ans = new int[newRowLength][newColLength];

        for(int i=0;i<rowLength;i++){
            for(int j=0;j<colLength;j++){
                ans[j][i]=matrix[i][j];
            }
        }
        return ans;
    }
}