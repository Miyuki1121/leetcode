/*
 * [4] Median of Two Sorted Arrays
 *
 * https://leetcode.com/problems/median-of-two-sorted-arrays
 *
 * Hard (21.40%)
 * Total Accepted:    166833
 * Total Submissions: 779435
 * Testcase Example:  '[1,3]\n[2]'
 *
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * 
 * Find the median of the two sorted arrays. The overall run time complexity
 * should be O(log (m+n)).
 * 
 * Example 1:
 * 
 * nums1 = [1, 3]
 * nums2 = [2]
 * 
 * The median is 2.0
 * 
 * 
 * 
 * Example 2:
 * 
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * 
 * The median is (2 + 3)/2 = 2.5
 * 
 * 
 */
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        //if(nums1[nums1.length - 1] > nums2[0])
        //{
            int i = 0, j = 0;
            for(int k = 0; k < nums.length; k++)
            {
                if(i > nums1.length - 1) nums[k] = nums2[j++];
                else if(j > nums2.length - 1) nums[k] = nums1[i++];
                else if(nums1[i] < nums2[j]) nums[k] = nums1[i++];
                else nums[k] = nums2[j++];
            }
        //}
        //else
        //{
            //for(int i = 0; i < nums1.length; i++)
            //{
                //nums[i] = nums1[i];
            //}          
            //for(int i = 0; i < nums2.length; i++)
            //{
                //nums[nums1.length+i] = nums2[i];
            //}
        //}
        float medium = 0;
        if(nums.length % 2 == 1)
        {
            medium = nums[nums.length / 2];
        }
        else
        {
            medium = nums[nums.length / 2 - 1] + nums[nums.length / 2];
            medium /= 2.0;
        }
        return medium;
    }
}
