package medium

fun main() {
    val result = numKLenSubstrNoRepeats("havefunonleetcode", 5)
    println(result)
}


private fun numKLenSubstrNoRepeats(s: String, k: Int): Int {
    var left = 0
    var right = 0
    val hashMap = hashMapOf<Char, Int>()
    var result = 0

    while (right < s.length) {
        val current = s[right]
        val count = hashMap.getOrDefault(current, 0)
        hashMap[current] = count + 1
        right++

        while (right - left > k || hashMap[current]!! > 1) {
            val toDelete = s[left]
            if (hashMap[toDelete] == 1) {
                hashMap.remove(toDelete)
            } else {
                hashMap[toDelete] = hashMap[toDelete]!! - 1
            }
            left++
        }

        if (hashMap.size == k) {
            result++
        }
    }

    return result
}