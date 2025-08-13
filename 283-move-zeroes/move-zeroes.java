class Solution {
    public void moveZeroes(int[] nums) {
        int count=0,i=0;
        while(i<nums.length) {
            if(nums[i]!=0) {
                nums[count]=nums[i];
                count++;
                i++;

            }
            else if (nums[i]==0) {
                i++;
            }

        }
        while(count<nums.length) {
            nums[count]=0;
            count++;
        }
    }
}