package learn.sorting

// QuickSort - O(nlogn)

fun quickSort(arr: IntArray): IntArray {
    quickSortHelper(arr, 0, arr.size - 1)
    return arr
}

fun quickSortHelper(arr: IntArray, start: Int, end: Int) {
    if (start >= end) return

    var pos = findMedian(arr, start, end)

    quickSortHelper(arr, start, pos - 1)
    quickSortHelper(arr, pos + 1, end)
    return
}

fun findMedian(arr: IntArray, start: Int, end: Int): Int {
    var pivot = start
    var smaller = start
    var bigger = start

    for (i in start + 1..end) {
        if (arr[i] <= arr[pivot]) {
            smaller += 1
            arr[i] = arr[smaller].also { arr[smaller] = arr[i] }
            bigger += 1
        } else {
            bigger += 1
        }
    }

    arr[pivot] = arr[smaller].also { arr[smaller] = arr[pivot] }

    return smaller
}