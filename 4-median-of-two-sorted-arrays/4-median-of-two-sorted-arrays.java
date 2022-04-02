class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int len = nums1.length + nums2.length;
        int arr[] = new int[len];
        
        System.arraycopy(nums1,0,arr,0,nums1.length);
        System.arraycopy(nums2,0,arr,nums1.length,nums2.length);
        
        Arrays.sort(arr);
    
        if(len % 2 == 0){
            double a = arr[(len/2)-1];
            double b = arr[len/2];
            double avg = ((a+b)/2);
            return avg;
        }
        else{
            double avg2 = arr[len/2];
            return avg2;
            
        }
        
    }
}