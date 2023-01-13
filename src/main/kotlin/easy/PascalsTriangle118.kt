package easy

fun main() {

    val result = generate(5)

    result.forEach {
        it.forEach { inner ->
            print(inner)
        }
        println()
    }

}

private fun generate(numRows: Int): List<List<Int>> {
    val finalList: MutableList<List<Int>> = mutableListOf()
    finalList.add(mutableListOf(1))

    for (i in 1 until numRows) {
        val currentList = mutableListOf<Int>()
        currentList.add(1)
        val previousList = finalList[i - 1]

        for (j in 1 until i) {
            currentList.add(previousList[j - 1] + previousList[j])
        }

        currentList.add(1)
        finalList.add(currentList)
    }

    return finalList
}