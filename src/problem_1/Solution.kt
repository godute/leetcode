package problem_1

/*
Input: nums = [2, 7, 11, 15], target = 9
Output: [0, 1] Because nums[0] + nums[1] == 9, we return [0, 1]
 */
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val result = intArrayOf()

        for (i in 0 until nums.lastIndex) {
            for(j in i+1..nums.lastIndex){
                if(nums[i] + nums[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        return result
    }
}