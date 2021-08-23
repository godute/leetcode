package problem_3

class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var result = 0

        var idx_i = 0
        var idx_j = 1

        while (idx_j <= s.length) {
            var subString = s.substring(idx_i, idx_j)
            val filtered = subString.groupBy { key -> key }.filter { entry -> entry.value.count() > 1 }

            if(filtered.isEmpty()) {
                if(result < idx_j - idx_i) result = idx_j - idx_i
                idx_j++
            }
            else {
                idx_i++
            }
        }

        return result
    }
}