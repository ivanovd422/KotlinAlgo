package easy

fun main() {

    val finalArray = intArrayOf(1, 2, 3, 0, 0, 0)
    merge(finalArray, 3, intArrayOf(2, 5, 6), 3)

    finalArray.forEach {
        println(it)
    }

}

private fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    var firstPointer = m - 1
    var secondPointer = n - 1

    for (i in m + n - 1 downTo 0) {
        if (firstPointer >= 0 && secondPointer >= 0) {
            if (nums1[firstPointer] >= nums2[secondPointer]) {
                nums1[i] = nums1[firstPointer]
                firstPointer--
            } else {
                nums1[i] = nums2[secondPointer]
                secondPointer--
            }
        } else if (firstPointer >= 0) {
            nums1[i] = nums1[firstPointer]
        } else {
            nums1[i] = nums2[secondPointer]
        }
    }
}