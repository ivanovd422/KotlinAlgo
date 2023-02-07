package easy

fun main() {

//    val result = findMaxAverage(intArrayOf(1, 12, -5, -6, 50, 3), 4)
    val result = findMaxAverage(intArrayOf(-1), 1)
    println(result)
}


private fun findMaxAverage(nums: IntArray, k: Int): Double {
    var windowSum = 0
    var startWindow = 0
    var maxSum = -Double.MAX_VALUE

    for (windowEnd in 0 until nums.size) {
        windowSum += nums[windowEnd]

        if (windowEnd >= k - 1) {
            maxSum = Math.max(maxSum, (windowSum.toDouble() / k))
            windowSum -= nums[startWindow]
            startWindow++
        }
    }

    return maxSum

}