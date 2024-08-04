import java.io.*
import kotlin.math.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val num = br.readLine().toLong()
    var right = Long.MAX_VALUE
    var left = 0L
    var result = right
    while (left <= right) {
        val mid = (right + left) / 2
        val moo = mid / 3 + mid / 5 - mid / 15
        if (mid - moo > num) {
            right = mid - 1
        } else if (mid - moo < num) {
            left = mid + 1
        } else {
            result = min(result, mid)
            right = mid - 1
        }
    }
    println(result)
}