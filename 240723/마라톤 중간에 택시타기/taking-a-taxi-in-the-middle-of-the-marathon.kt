import java.io.*
import kotlin.math.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val num =
        br
            .readLine()
            .toInt()
    val arr = Array(num) { IntArray(2) }
    val lArr = IntArray(num + 1)
    val rArr = IntArray(num + 1)
    for (i in 0 until num) {
        arr[i] =
            br
                .readLine()
                .trim()
                .split(" ")
                .map { it.toInt() }
                .toIntArray()
    }
    for (i in 1 until num) {
        lArr[i] =
            lArr[i - 1] + abs(arr[i][0] - arr[i - 1][0]) + abs(arr[i][1] - arr[i - 1][1])
    }
    for (i in num - 2 downTo 0) {
        rArr[i] =
            rArr[i + 1] + abs(arr[i][0] - arr[i + 1][0]) + abs(arr[i][1] - arr[i + 1][1])
    }
    var min = Int.MAX_VALUE
    for (i in 1 until num - 1) {
        val now =
            lArr[i - 1] + rArr[i + 1] +
                abs(arr[i - 1][0] - arr[i + 1][0]) + abs(arr[i - 1][1] - arr[i + 1][1])
        if (min > now) {
            min = now
        }
    }
    println(min)
}