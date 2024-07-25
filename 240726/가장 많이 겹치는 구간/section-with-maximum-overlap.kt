import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val nums =
        br
            .readLine()
            .toInt()
    var min = Int.MAX_VALUE
    var max = Int.MIN_VALUE
    var arr = IntArray(200001)
    for (i in 0 until nums) {
        val n =
            br
                .readLine()
                .trim()
                .split(" ")
                .map { it.toInt() }
                .toIntArray()
        if (max < n[1]) {
            max = n[1]
        }
        if (min > n[0]) {
            min = n[0]
        }
        arr[n[0]] = 1
        arr[n[1]] = -1
    }
    var maxCount = 0
    var now = 0
    for (i in min..max) {
        now += arr[i]
        if (now > maxCount) {
            maxCount = now
        }
    }
    println(maxCount)
}