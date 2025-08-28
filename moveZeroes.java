
// suuuuuper inefficient but whatever, it works
class Solution {
    public void moveZeroes(int[] nums) {
        int swap = 0;

        for (int i = 0; i < nums.length; ++i) {
            for (int j = i; j < nums.length; ++j) {
                if (nums[i] == 0) {
                    swap = nums[i];
                    nums[i] = nums[j];
                    nums[j] = swap;
                }
            }
        }

    }
}
