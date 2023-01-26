package learn.sorting

fun main() {

}

//Insertion Sort -  O(n2)
private fun insertionSort(intArray: IntArray) {


    for (i in 1 until intArray.size) {
        var currentIndex = i

        while (currentIndex > 0 && intArray[currentIndex - 1] > intArray[currentIndex]) {
            val temp = intArray[currentIndex]
            intArray[currentIndex] = intArray[currentIndex - 1]
            intArray[currentIndex - 1] = temp
            currentIndex--
        }
    }
}