package medium



fun main() {
    val result = maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5))
    println(result)
}

// Dynamic Programming, Kadane's Algorithm, https://en.wikipedia.org/wiki/Maximum_subarray_problem#Kadane's_algorithm
private fun maxSubArray(nums: IntArray): Int {
    var maxSum = nums[0]
    var currentSum = nums[0]

    for (i in 1 until nums.size) {
        val num = nums[i]

        currentSum = Math.max(num, currentSum + num)
        maxSum = Math.max(maxSum, currentSum)
    }

    return maxSum
}