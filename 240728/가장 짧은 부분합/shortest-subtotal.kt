import java.io.*
import kotlin.math.*

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
    var min = Int.MAX_VALUE
    var p1 = 0
    var p2 = 0
    var total = arr[0]
    var count = 1
    while (p1 < nums[0] && p2 < nums[0]) {
        if (total >= nums[1]) {
            min = min(min, count)
            total -= arr[p1]
            p1++
            count--
        }
        if (p1 == p2 || total < nums[1]) {
            p2++
            if (p2 == nums[0]) {
                break
            }
            total += arr[p2]
            count++
        }
    }
    println(if (min == Int.MAX_VALUE) -1 else min)
}