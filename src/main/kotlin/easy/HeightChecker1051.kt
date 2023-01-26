package easy

fun main() {

}

private fun heightChecker(heights: IntArray): Int {
    var count = 0
    val sorted = heights.copyOf()
    sorted.sort()

    for (i in 0 until heights.size) {
        if (heights[i] != sorted[i]) {
            count++
        }
    }

    return count
}