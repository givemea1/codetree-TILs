import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var num =
        br
            .readLine()
            .trim()
            .split(" ")
            .map { it.toInt() }
            .toTypedArray()
    val coins = IntArray(num[0])
    for (i in 0 until num[0]) {
        coins[i] = br.readLine().toInt()
    }
    var result = 0
    var now = num[0] - 1
    while (num[1] != 0) {
        result += num[1] / coins[now]
        num[1] = num[1] % coins[now]
        now--
    }
    println(result)
}