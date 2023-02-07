package medium

fun main() {

//    val nums = intArrayOf(1,1,1,1,1)
//    val k = 1
//    val result = numberOfSubarrays(nums, k)
//    println(result)

    test()
}



private fun numberOfSubarrays(nums: IntArray, k: Int): Int {
    var left = 0
    var right = 0
    var result = 0
    var currentOddCount = 0

    while (left != nums.size - k && right != nums.size) {
        if (isCurrentNumberIsOdd(nums[right])) {
            currentOddCount++
        }

        if (currentOddCount == k && right - left >= k - 1) {
            result++
        }

        while (currentOddCount >= k && left <= right) {
            if (isCurrentNumberIsOdd(nums[left])) {
                currentOddCount--
            }
            left++
        }

        if (currentOddCount < k) {
            right++
        }
    }

    return result
}

private fun isCurrentNumberIsOdd(number: Int): Boolean {
    return number % 2 != 0
}

private fun test() {
    var a = 0
    var b = 0
    var i = 1

    while (a != 5 || b != 5) {
        println("iteration - $i")
        i++

        if (a != 5) {
            a++
        } else {
            b++
        }
    }
}