package easy

fun main() {

    val result = containsDuplicate(intArrayOf(1,5,-2,-4,0))
    println(result)
}

private fun containsDuplicate(nums: IntArray): Boolean {
    val hashSet = hashSetOf<Int>()

    for (i in nums) {
        if (hashSet.contains(i)) {
            return true
        } else {
            hashSet.add(i)
        }
    }

    return false
}