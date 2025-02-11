class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
    }
        int[] poss = new int[n+1];
        poss[0]=0;
        poss[1]=1;
        for(int index = 2; index<=n; index++){
            poss[index] = poss[index-1]+poss[index-2];
        }
        return poss[n];
    }
}