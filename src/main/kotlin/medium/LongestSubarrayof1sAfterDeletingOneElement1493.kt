package medium

import java.util.*

fun main() {
    val nums = intArrayOf(1, 1, 0, 0, 1, 1, 1, 0, 0, 1)

    val result = longestSubarray(nums)

    println(result)

}


private fun longestSubarray(nums: IntArray): Int {
    var prev = 0
    var current = 0
    var max = 0

    for (i in nums.indices) {
        if (nums[i] == 1) {
            current++
            max = Math.max(max, current + prev)
        } else {
            prev = current
            current = 0
        }
    }

    if (max == nums.size) {
        max--
    }

    return max

}