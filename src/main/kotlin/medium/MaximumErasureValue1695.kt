package medium

fun main() {

}

private fun maximumUniqueSubarray(nums: IntArray): Int {
    val hashMap = hashMapOf<Int, Int>()
    var result = 0
    var currentSum = 0
    var left = 0

    for (i in 0..nums.size - 1) {

        hashMap[nums[i]] = hashMap.getOrDefault(nums[i], 0) + 1
        currentSum += nums[i]

        if (i - left == hashMap.size - 1) {
            result = Math.max(currentSum, result)
        }

        while (i - left > hashMap.size - 1) {
            currentSum -= nums[left]

            if (hashMap[nums[left]]!! > 1) {
                hashMap[nums[left]] = hashMap[nums[left]]!! - 1
            } else {
                hashMap.remove(nums[left])
            }
            left++
        }


    }

    return result
}