class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int[] array = new int[matrix.length*matrix[0].length];
        int k = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                array[k++]=matrix[i][j];
                
            }
            
            }

        for(int z = 0;z<array.length;z++){
            if(array[z]==target){
                return true;
            }
        }
    return false;
    }
}
