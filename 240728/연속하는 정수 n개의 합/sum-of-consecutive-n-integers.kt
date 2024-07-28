import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val nums =
        br
            .readLine()
            .trim()
            .split(" ")
            .map { it.toInt() }
            .toTypedArray()
    val arr =
        br
            .readLine()
            .trim()
            .split(" ")
            .map { it.toInt() }
            .toTypedArray()
    var result = 0
    var p1 = 0
    var p2 = 0
    var total = arr[0]
    while (p1 < nums[0] && p2 < nums[0]) {
        if (total == nums[1]) {
            result++
            total -= arr[p1]
            p1++
        }
        if (p1 == p2 || total < nums[1]) {
            p2++
            if (p2 == nums[0]) {
                break
            }
            total += arr[p2]
        } else {
            total -= arr[p1]
            p1++
        }
    }
    println(result)
}