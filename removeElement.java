
// I did get ai's help on this one cause i was having trouble with a few edge cases
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                ++k;
            }
            
        }

        return k;


    }
}
