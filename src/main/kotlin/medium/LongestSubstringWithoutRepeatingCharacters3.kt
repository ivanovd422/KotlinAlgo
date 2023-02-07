package medium


fun main() {
    val s = "pwwkew"

    val result = lengthOfLongestSubstring(s)
    println(result)
}

private fun lengthOfLongestSubstring(s: String): Int {
    val chars = hashMapOf<Char, Int>()

    var left = 0
    var right = 0
    var res = 0

    while (right < s.length) {
        val r = s[right]
        val value= chars.getOrDefault(r,0) + 1
        chars[r] = value

        while (chars[r]!! > 1) {
            val l = s[left]
            chars[l] = chars[l]!! - 1
            left++
        }

        res = Math.max(res, right - left + 1)

        right++
    }


    return res

}
