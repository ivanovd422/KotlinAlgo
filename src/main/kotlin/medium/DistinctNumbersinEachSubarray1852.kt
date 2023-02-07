package medium

fun main() {

}

private fun distinctNumbers(nums: IntArray, k: Int): IntArray {
    val n = nums.size
    val array = IntArray(n - k + 1)
    val hashMap = hashMapOf<Int, Int>()
    var left = 0
    for (i in 0..n - 1) {
        hashMap[nums[i]] = hashMap.getOrDefault(nums[i], 0) + 1


        if (i - left == k - 1) {
            array[left] = hashMap.size

            if (hashMap[nums[left]]!! > 1) {
                hashMap[nums[left]] = hashMap[nums[left]]!! - 1
            } else {
                hashMap.remove(nums[left])
            }
            left++
        }
    }

    return array
}