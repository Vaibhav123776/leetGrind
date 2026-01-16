class Solution {
    public int removeDuplicates(int[] nums) {
        int w = 0;
        int R = 1;
        while(R<nums.length) {
            if(nums[w]!=nums[R]) {
                w++;
                nums[w]=nums[R];

            }
            R++;

        }
        return w+1;
        
    }
}