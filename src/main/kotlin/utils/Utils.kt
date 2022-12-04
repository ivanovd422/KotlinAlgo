package utils



fun runWithTime(algo: () -> Unit) {
    val start = System.currentTimeMillis()
    algo.invoke()
    val end = System.currentTimeMillis()
    println("------------------------------")
    println("Time - ${end - start}")
    println("------------------------------")
}