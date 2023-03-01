package medium

fun main() {
    val result = threeSum(intArrayOf(0,1,1))

    result.forEach { out ->

        out.forEach {
            print(it)
        }
        println()
    }

}

private fun threeSum(nums: IntArray): List<List<Int>> {
    val finalList = mutableListOf<MutableList<Int>>()
    nums.sort()

    if (nums.size == 3) {
        finalList.add(nums.toMutableList())
        return finalList
    }

    for (i in 0..nums.size - 3) {
        if (i > 0 && nums[i] == nums[i - 1]) {
            continue
        }

        twoSum(nums, -nums[i], i, finalList)
    }

    return finalList
}

private fun twoSum(nums: IntArray, target: Int, left1: Int, list: MutableList<MutableList<Int>>) {
    var left = left1 + 1
    var right = nums.size - 1

    while (left < right) {
        val sum = nums[left] + nums[right]

        if (sum == target) {
            list.add(
                mutableListOf(nums[target], nums[left], nums[right])
            )
            left++
            right--

            while (left < right && nums[left] == nums[left - 1]) {
                left++
            }

            while (left < right && nums[right] == nums[right + 1]) {
                right--
            }
        } else if (target > sum) {
            left++
        } else {
            right--
        }

    }
}