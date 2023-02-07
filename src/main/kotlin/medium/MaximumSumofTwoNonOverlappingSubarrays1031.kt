package medium

fun main() {
    val result = maxSumTwoNoOverlap(intArrayOf(0,6,5,2,2,5,1,9,4), 1, 2)
    println(result)
}


private fun maxSumTwoNoOverlap(nums: IntArray, firstLen: Int, secondLen: Int): Int {
    return Math.max(maxSum(nums, firstLen, secondLen), maxSum(nums, secondLen, firstLen))
}

private fun maxSum(nums: IntArray, firstLen: Int, secondLen: Int): Int {
    var firstStart = 0
    var secondStart = 0
    var secondEnd = 0


    var firstMax = 0
    var secondMax = 0
    var firstCurrent = 0
    var secondCurrent = 0

    var occupiedStart = 0
    var occupiedEnd = 0

    for (i in 0..nums.size - 1) {
        firstCurrent += nums[i]

        if (i - firstStart > firstLen-1) {
            firstCurrent -= nums[firstStart]
            firstStart++
        }

        if (i - firstStart == firstLen - 1) {
            if (firstCurrent > firstMax) {
                firstMax = firstCurrent

                occupiedStart = firstStart
                occupiedEnd = i
            }
            firstMax = Math.max(firstMax, firstCurrent)
        }

        while (secondLen + secondEnd <= firstStart) {
            secondCurrent += nums[secondEnd]

            if (secondEnd - secondStart == secondLen && secondStart !in occupiedStart..occupiedEnd && secondEnd !in occupiedStart..occupiedEnd) {
                secondMax = Math.max(secondMax, secondCurrent)
            }

            if (secondEnd - secondStart > secondLen - 1) {
                secondCurrent -= nums[secondStart]
                secondStart++
            }
            secondEnd++
        }
    }

    return firstMax + secondMax
}
