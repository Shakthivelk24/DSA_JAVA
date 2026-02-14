class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %=n;

        rev(nums,0,n-1); // Reversing the whole array
        rev(nums,0,k-1); // Reversing the first k elements
        rev(nums,k,n-1); // Reversing the remaining n-k elements
    }
    // Reversing the array to get the desired output
    public static void rev(int[] nums,int start,int end){
        while(start<=end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] =temp;
            start++;
            end--;
        }
    }
}
