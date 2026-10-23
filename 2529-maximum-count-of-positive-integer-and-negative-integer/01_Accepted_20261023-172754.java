
class Solution {
    public int maximumCount(int[] nums) {
        int lo = 0;
        int hi = nums.length - 1;
        int pos = 0;
        int neg = 0;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (nums[mid] < 0) {
                neg = mid + 1;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        // Reset lo and hi for the second binary search
        lo = 0;
        hi = nums.length - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (nums[mid] > 0) {
                pos = nums.length - mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return Math.max(neg, pos);
    }
}
