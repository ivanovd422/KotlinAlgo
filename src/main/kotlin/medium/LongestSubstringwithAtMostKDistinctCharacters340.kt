package medium

fun main() {

}

private fun lengthOfLongestSubstringKDistinct(s: String, k: Int): Int {
    var result = 0
    var current = 0
    val hashMap = hashMapOf<Char, Int>()
    var left = 0
    var n = s.length

    for (i in 0..n - 1) {
        val char = s[i]
        hashMap[char] = hashMap.getOrDefault(char, 0) + 1
        current++

        while (hashMap.size > k) {
            hashMap[s[left]] = hashMap[s[left]]!! - 1

            if (hashMap[s[left]] == 0) {
                hashMap.remove(s[left])
            }

            left++
            current--
        }

        result = Math.max(result, current)
    }

    return result

}