class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        while(start<=end) {
            int mid = (start+end)/2;

            if(nums[mid]<target) {
                start = mid+1;
            }
            else if(nums[mid]>target) {
                end = mid-1;
            }
            else {
             
                return mid;
            }
            
            }
            return -1;
        
        
            }
        }
      