package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.cn/problems/two-sum/
 * 1. 两数之和
 *
 * @author Lin
 * @date 2023/7/1
 */
public class TwoSum {

  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap();
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(target - nums[i])) {
        return new int[]{map.get(target - nums[i]), i};
      }
      map.put(nums[i], i);
    }

    return new int[0];
  }
}
