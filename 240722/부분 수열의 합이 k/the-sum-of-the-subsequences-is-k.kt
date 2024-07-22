import java.io.*

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
    var count = 0
    var now = 0
    var start = 0
    for (j in 0 until nums[0]) {
        now += arr[j]
        while (now > nums[1]) {
            now -= arr[start]
            start++
        }
        if (now == nums[1]) {
            count++
        }
    }
    print(count)
}