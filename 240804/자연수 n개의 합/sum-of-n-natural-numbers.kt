import java.io.*
import kotlin.math.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val num = br.readLine().toLong()
    var right = (sqrt(num.toDouble()).toLong() * 2)
    var left = 0L
    var result = -1L
    while (left < right) {
        val mid = (right + left) / 2
        if ((mid * (mid - 1)) / 2 < num) {
            left = mid + 1
            result = mid
        } else {
            right = mid - 1
        }
    }
    println(result)
}