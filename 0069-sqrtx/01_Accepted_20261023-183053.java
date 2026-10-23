class Solution {
    public int mySqrt(int n) {
        int lo=0;
        int hi=n;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if ((long)mid*mid==n) return mid;
            else if ((long)mid*mid<n) lo=mid+1;
            else hi=mid-1;
        }
        return hi;
    }
}