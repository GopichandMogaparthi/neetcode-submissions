class Solution {
    public int[][] kClosest(int[][] points, int k) {


    /*
    Given 2D Array - Points where point[i]
    [xi,yi] Coordinates of a point X-Y plane. 
    Given an integer k

    Return the k closest points to the origin (0,0).





    */

    int n = points.length;
    int[][] result = new int[k][2];
    boolean[] used = new boolean[n];

    for(int i=0;i<k;i++){
        int min_Index=-1;
        int min_Dist = Integer.MAX_VALUE;
        //find closest point
        for(int j=0;j<n;j++){
            if(used[j]){
                continue;
            }
            int x = points[j][0];
            int y = points[j][1];
            int dist = x*x+y*y;
            if(dist<min_Dist){
                min_Dist=dist;
                min_Index=j;
            }
        }
        result[i][0]=points[min_Index][0];
        result[i][1]=points[min_Index][1];
        used[min_Index] = true;
    }

        return result;

    }
}