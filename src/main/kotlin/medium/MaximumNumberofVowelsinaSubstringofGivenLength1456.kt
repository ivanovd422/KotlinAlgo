package medium

fun main() {

    var array = IntArray(5)

    array.forEach {
        println(it)
    }
}

private fun maxVowels(s: String, k: Int): Int {
    val vowels = arrayOf<Char>('a', 'e', 'i', 'o', 'u')
    var result = 0
    var current = 0
    var left = 0

    for (i in 0..s.length - 1) {
        if (vowels.contains(s[i])) {
            current++
        }

        while (i - left >= k) {
            if (vowels.contains(s[left])) {
                current--
            }
            left++
        }

        if (i - left >= k - 1) {
            result = Math.max(current, result)
        }
    }

    return result
}