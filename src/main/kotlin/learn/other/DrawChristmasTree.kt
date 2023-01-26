package learn.other

fun main() {

    drawChristmasTree(10)
}

private fun drawChristmasTree(levels: Int) {
    for (i in 0..levels) {
        for (j in 0..levels - i) {
            print("#")
        }

        for (k in 0..(2 * i + 1)) {
            print("*")
        }

        println()
    }
}