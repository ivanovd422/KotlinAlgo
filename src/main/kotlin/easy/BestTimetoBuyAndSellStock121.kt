package easy

fun main() {
    val result = maxProfit(intArrayOf(7, 1, 5, 3, 6, 4))
    println(result)
}

private fun maxProfit(prices: IntArray): Int {
    var minPrice = Int.MAX_VALUE
    var profit = 0

    for (i in prices.indices) {

        if (prices[i] < minPrice) {
            minPrice = prices[i]
        } else if (prices[i] - minPrice > profit) {
            profit = prices[i] - minPrice
        }
    }

    return profit
}