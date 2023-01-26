package learn.sorting


// MergeSort - O(nlogn)
fun mergeSort(arr: IntArray): IntArray {
    helper(arr, 0, arr.size - 1)
    return arr
}

fun helper(arr: IntArray, start: Int, end: Int) {
    if (start >= end) return

    var mid = start + ((end - start) / 2).toInt()
    helper(arr, start, mid)
    helper(arr, mid + 1, end)

    //merging the array
    var i = start
    var j = mid + 1
    var auxArr = mutableListOf<Int>()

    while (i <= mid && j <= end) {
        if (arr[i] <= arr[j]) {
            auxArr.add(arr[i])
            i += 1
        } else {
            auxArr.add(arr[j])
            j += 1
        }
    }

    // If element remaining in left array
    while (i <= mid) {
        auxArr.add(arr[i])
        i += 1
    }

    // If elements remaining in right array
    while (j <= end) {
        auxArr.add(arr[j])
        j += 1
    }

    // Copying Temp array to Arr
    var k = 0
    for (i in start..end) {
        arr[i] = auxArr[k]
        k += 1
    }
    return
}