package array;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 * Given an array of integers, return indices of the 
 * two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, 
 * and you may not use the same element twice.
 * 
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * @author Lu
 *
 */
public class TowSum {
	public static void main(String[] args) {
		
	}
	public int[] twoSum(int[] nums,int target){
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		int[] result=new int[2];
		for(int i=0;i<nums.length;i++) {
			if(map.containsKey(target-nums[i])) {
				result[0]=map.get(target-nums[i]);
				result[1]=i;
				break;
			}
			map.put(nums[i],i);
		}
		return result;
	}
}
