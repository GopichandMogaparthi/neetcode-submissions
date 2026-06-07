class Solution {
    public void rotate(int[][] matrix) {

        /*
        a[0][0] = x1; a[0][1] = x2;

        a[1][0] = y1; a[1][1] = y2;

        a[1][0] = y1; a[0][0] = x1;
        a[1][1] = y2; a[0][1] = x2;

        first row -> second column
        second row -> first column

        i= 0 ; j=0  answer : i+1;j=0
        i=0 ; j=1   answer : i=0;j-1;
        i =1 ; j=0 answer : i=1;j+1;
        i=1 ; j=1; answer : i-1;j=1;



        
        */


    int n = matrix.length;

    //Step 1 : Transpose matrix

    for(int i = 0;i<n;i++){
        for(int j =i+1;j<n;j++){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
    }

//Step 2 : Reverse each row

for(int i =0; i<n;i++){
    int left = 0;
    int right = n-1;

    while(left<right){
        int temp = matrix[i][left];
        matrix[i][left] = matrix[i][right];
        matrix[i][right] = temp;

        left++;
        right--;
    }
}




        
    }
}
