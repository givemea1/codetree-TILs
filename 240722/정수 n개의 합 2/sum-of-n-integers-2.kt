import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val nums =
        br
            .readLine()
            .trim()
            .split(" ")
            .map { it.toInt() }
    val arr =
        br
            .readLine()
            .trim()
            .split(" ")
            .map { it.toInt() }
    var max = 0
    for (i in 0 until nums[1]) {
        max += arr[i]
    }
    var now = max
    for (j in nums[1] until nums[0]) {
        now = now + arr[j] - arr[j - nums[1]]
        if (now > max)
            {
                max = now
            }
    }
    print(max)
}