class Solution {
    public double myPow(double x, int n) {

        //Check if the given number is zero or not anything power zero is zero

        if(x==0){
            return 0;
        }
        //If power is zero return 1 anything power zero is one
        if(n==0){
            return 1;
        }

        double res =1;

        for(int i=0;i<Math.abs(n);i++){
            res=res*x;
        }
        return n>=0 ? res : 1/res;
    }
}
