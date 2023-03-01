package medium

fun main() {
    val s = "ababcbacadefegdehijhklij"

    val result = partitionLabels(s)

    result.forEach {
        print(it)
    }

}

private fun partitionLabels(s: String): List<Int> {
    val result = mutableListOf<Int>()
    val map = hashMapOf<Char, Int>()

    for (i in 0..s.lastIndex) {
        map[s[i]] = i
    }

    var start = 0
    var end = 0

    for (i in 0..s.lastIndex) {
        end = maxOf(end, map[s[i]]!!)

        if (end == i) {
            result.add(end - start + 1)
            start = end + 1
        }
    }
    return result
}