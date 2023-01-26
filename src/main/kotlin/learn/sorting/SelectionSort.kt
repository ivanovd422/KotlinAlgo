package learn.sorting

fun main() {

    val arrayToSort = intArrayOf(7, 3, 2, 5, 6, 10, 9, 8, 1)
    selectionSort(arrayToSort)
    arrayToSort.forEach {
        print(it)
    }
    println()
}

// Selection Sort O(n2)
fun selectionSort(array: IntArray) {
    var minIndex: Int
    for (i in array.indices) {
        minIndex = i
        for (j in i + 1 until array.size) {
            if (array[j] < array[minIndex]) {
                minIndex = j
            }
        }
        val temp = array[minIndex]
        array[minIndex] = array[i]
        array[i] = temp
    }
}
