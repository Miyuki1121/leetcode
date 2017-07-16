public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int nums1 = 0;
        int nums2 = 0;
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i + 1; j < nums.length; j++)
            {
                if(target == (nums[i] + nums[j]))
                {
                    nums1 = i;
                    nums2 = j;
                }
            }
        }
        int[] returnValve = new int[] {nums1, nums2};
        return returnValve;
    }
}