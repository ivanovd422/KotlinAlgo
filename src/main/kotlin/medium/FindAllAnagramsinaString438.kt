package medium

fun main() {
    val s = "cbaebabacd"
    val p = "abc"

    val result = findAnagrams(s, p)

    result.forEach {
        print(it)
    }

}

private fun findAnagrams(s: String, p: String): List<Int> {
    val list = mutableListOf<Int>()
    val hashMap = hashMapOf<Char, Int>()
    val secondHashMap = hashMapOf<Char, Int>()

    for (i in 0..p.length - 1) {
        hashMap[p[i]] = hashMap.getOrDefault(p[i], 0) + 1
    }

    val window = p.length
    var left = 0

    for (i in 0..s.length - 1) {
        secondHashMap[s[i]] = secondHashMap.getOrDefault(s[i], 0) + 1

        while (i - left == window - 1) {
            if (hashMap == secondHashMap) {
                list.add(left)
            }

            secondHashMap[s[left]] = secondHashMap[s[left]]!! - 1
            if (secondHashMap[s[left]] == 0) {
                secondHashMap.remove(s[left])
            }
            left++
        }
    }

    return list
}