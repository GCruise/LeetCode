package array;
/**
 * Description:
 * Find the contiguous subarray within an array (containing at least one number) 
 * which has the largest sum.
 * 
 * Example:
 * given the array [-2,1,-3,4,-1,2,1,-5,4],
 * the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 * @author Lu
 *
 */
public class MaximumSubarray {
	public int maxSubArray(int[] nums) {
        int[] bp=new int[nums.length];
        bp[0]=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            bp[i]=Math.max(nums[i],bp[i-1]+nums[i]);
            if(bp[i]>max){
                max=bp[i];
            }
        }
        return max;
    }
}
