package problem_1

/*
Input: nums = [2, 7, 11, 15], target = 9
Output: [0, 1] Because nums[0] + nums[1] == 9, we return [0, 1]
 */
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        nums.forEachIndexed { index, int ->
            map[int]?.let { return intArrayOf(it, index) }
            map[target - int] = index
        }
        return intArrayOf()
    }
}