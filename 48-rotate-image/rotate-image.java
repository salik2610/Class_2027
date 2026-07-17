class Solution {
    public void rotate(int[][] matrix) {
        int M = matrix.length;
        int N = matrix[0].length;
        //transpose nikalna hai pr in place hi toh diagonal se upar wale pe kaam krte hai
        for(int i=0;i<M;i++){
            for(int j=i+1;j<M;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        //reverse krdo re baba ab 
        for(int row=0;row<M;row++){ //sirf row reverse hora
                //reverse krne ke lie swap krna 
                int startCol=0;
                int endCol=N-1;
                
                while(startCol<=endCol){
                    int temp=matrix[row][startCol];
                    matrix[row][startCol]=matrix[row][endCol];
                    matrix[row][endCol]=temp;

                    startCol++;
                    endCol--;
                }

        }
        
    }
}