package medium

fun main() {

}

private fun checkInclusion(s1: String, s2: String): Boolean {
    val hashMap = hashMapOf<Char, Int>()
    val secondHashMap = hashMapOf<Char, Int>()

    for (i in 0..s1.length - 1) {
        hashMap[s1[i]] = hashMap.getOrDefault(s1[i], 0) + 1
    }

    var left = 0
    val windowSize = s1.length

    for (i in 0..s2.length - 1) {
        secondHashMap[s2[i]] = secondHashMap.getOrDefault(s2[i], 0) + 1

        while (i - left == windowSize - 1) {
            if (hashMap == secondHashMap) {
                return true
            }

            if (secondHashMap[s2[left]] == 1) {
                secondHashMap.remove(s2[left])
            } else {
                secondHashMap[s2[left]] = secondHashMap[s2[left]]!! - 1
            }
            left++
        }
    }

    return false
}