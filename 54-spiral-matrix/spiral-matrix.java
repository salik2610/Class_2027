class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
    
        
        int m = matrix.length;
        int n = matrix[0].length;
         List<Integer> result = new ArrayList<>();
        int startingRow=0;
        int endingRow=m-1;
        int startingCol=0;
        int endingCol=n-1;

        while(startingRow<=endingRow && startingCol<=endingCol){
            //row wise ltor , starting row print krni hai from starting col to ending col
            for(int col=startingCol;col<=endingCol;col++){
                result.add(matrix[startingRow][col]);
            }
            startingRow++;
            //col wise top to bottom starting, ending col print krna hai from starting row to ending col 
            for (int row=startingRow;row<=endingRow;row++){
                result.add(matrix[row][endingCol]);
            }
            endingCol--;

            //row wise r to l, ending row print krni hai, ending col to starting col mai
            if (startingRow<=endingRow){
                for(int rowend=endingCol;rowend>=startingCol;rowend--){
                result.add(matrix[endingRow][rowend]);
            }
            endingRow--;
            }
            // col wise bottom to top , col print krna bottom to top
           if(startingCol<=endingCol){
             for(int endrow=endingRow;endrow>=startingRow;endrow--){
                result.add(matrix[endrow][startingCol]);
            }
            startingCol++;
           }
           
        }
        return result;
    }
}