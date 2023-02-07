package medium

fun main() {
//    val array = intArrayOf(2,2,2,2,5,5,5,8)
//    val k = 3
//    val threshold = 4
    val array = intArrayOf(11,13,17,23,29,31,7,5,2,3)
    val k = 3
    val threshold = 5
    val result = numOfSubarrays(array, k, threshold)
    println(result)

}

private fun numOfSubarrays(arr: IntArray, k: Int, threshold: Int): Int {
    var result = 0
    var currentSum = 0
    var left = 0
    var right = 0

    while (right != arr.size - 1) {
        currentSum += arr[right]

        if (right - left + 1 == k) {
            if (currentSum / k >= threshold) {
                result++
            }

            currentSum -= arr[left]
            left++
        }
        right++
    }

    return result
}