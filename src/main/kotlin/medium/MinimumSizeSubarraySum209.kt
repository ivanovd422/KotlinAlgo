package medium

fun main() {

}

private fun minSubArrayLen(target: Int, nums: IntArray): Int {
    var minLength = Int.MAX_VALUE
    var left = 0
    var currentSum = 0

    for (i in 0..nums.size - 1) {
        currentSum += nums[i]

        while (currentSum >= target) {
            val currentLength = i - left + 1
            minLength = Math.min(minLength, currentLength)
            currentSum -= nums[left]
            left++
        }
    }

    if (minLength == Int.MAX_VALUE) {
        return 0
    }

    return minLength
}