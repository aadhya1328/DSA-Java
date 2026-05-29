class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int num1=nums1.length;
        int num2=nums2.length;
        int[] arr=new int[num1+num2];
        int k=0;
        for(int i=0;i<num1;i++){
            arr[k]=nums1[i];
            k++;
        }
        for(int i=0;i<num2;i++){
            arr[k]=nums2[i];
            k++;
        }
        Arrays.sort(arr);
        int n = arr.length;
        if (n%2==1){
            return arr[n/2];
        } else{
            return (arr[n/2]+arr[(n/2)-1])/2.0;
        }
    }
}