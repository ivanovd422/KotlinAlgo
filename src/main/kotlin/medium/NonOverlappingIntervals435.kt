package medium


fun main() {

    val intervals = arrayOf(
        intArrayOf(1,2),
        intArrayOf(2,3),
        intArrayOf(3,4),
        intArrayOf(1,3),
    )
    val result = eraseOverlapIntervals(intervals)

    println(result)
}

//[[1,2],[2,3],[3,4],[1,3]] -> [[1,2],[1,3],[2,3],[3,4]]
private fun eraseOverlapIntervals(intervals: Array<IntArray>): Int {
    if (intervals.size < 2) return 0
    intervals.sortBy { it[0] }
    var result = 0
    var end = intervals[0][1]

    for (i in 1..intervals.size - 1) {
        if (intervals[i][0] < end) {
            end = Math.min(end, intervals[i][1])
            result++
        } else{
            end = intervals[i][1]
        }
    }

    return result
}