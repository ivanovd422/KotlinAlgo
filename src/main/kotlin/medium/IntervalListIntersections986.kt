package medium

import java.util.*

fun main() {
    //[[0,2],[5,10],[13,23],[24,25]], secondList = [[1,5],[8,12],[15,24],[25,26]]
    val firstList = arrayOf(
        intArrayOf(0, 2),
        intArrayOf(5, 10),
        intArrayOf(13, 23),
        intArrayOf(24, 25),
    )

    val secondList = arrayOf(
        intArrayOf(1, 5),
        intArrayOf(8, 12),
        intArrayOf(15, 24),
        intArrayOf(25, 26),
    )

    val result = intervalIntersection(firstList, secondList)

    result.forEach {
        print(it[0])
        print(",${it[1]}")
        println()
    }
}

private fun intervalIntersection(firstList: Array<IntArray>, secondList: Array<IntArray>): Array<IntArray> {
    val merged = LinkedList<IntArray>()
    val size = firstList.size + secondList.size
    var sorted = Array<IntArray>(size) { intArrayOf() }

    for (i in 0..firstList.size - 1) {
        sorted[i] = firstList[i]
    }

    for (i in 0..secondList.size - 1) {
        sorted[firstList.size  + i] = secondList[i]
    }

    sorted.sortBy { it[0] }

    var first = 0
    var second = 1

    while (second < sorted.size) {

        if (sorted[first][1] < sorted[second][0]) {
            first++
            second++
            continue
        }


        while (second < sorted.size - 1 && sorted[first][1] >= sorted[second + 1][0]) {
            second++
        }


        merged.add(
            intArrayOf(
                Math.max(sorted[first][0], sorted[second][0]),
                Math.min(sorted[first][1], sorted[second][1])
            )
        )
        first = second
        second++

    }

    return merged.toTypedArray()

}