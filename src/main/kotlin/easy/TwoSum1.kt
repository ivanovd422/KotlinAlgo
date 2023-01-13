package easy


fun main() {

    val result = twoSum(intArrayOf(3,2,4), 6)

    result.forEach {
        println(it)
    }
}

private fun twoSum(nums: IntArray, target: Int): IntArray {
    val finalArray = IntArray(2)
    val map = hashMapOf<Int, Int>()

    for (i in nums.indices) {
        map[nums[i]] = i
    }

    for (i in nums.indices) {
        val complement = target - nums[i]

        if (map.containsKey(complement) && map[complement] != i) {
            return intArrayOf(i, map[complement]!!)
        }
    }


    return finalArray
}