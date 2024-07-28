import java.io.*
import java.util.TreeMap
import kotlin.math.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val nums =
        br
            .readLine()
            .toInt()
    var minVal = Int.MAX_VALUE
    var maxVal = Int.MIN_VALUE
    var map: TreeMap<Int, Int> = TreeMap<Int, Int>()
    for (i in 0 until nums) {
        val n =
            br
                .readLine()
                .trim()
                .split(" ")
                .map { it.toInt() }
                .toIntArray()
        if (maxVal < n[1]) {
            maxVal = n[1]
        }
        if (minVal > n[0]) {
            minVal = n[0]
        }
        map.get(n[0]).also {
            if (it == null) {
                map.put(n[0], 1)
            } else {
                map.put(n[0], it + 1)
            }
        }
        map.get(n[1]).also {
            if (it == null) {
                map.put(n[1], -1)
            } else {
                map.put(n[1], it - 1)
            }
        }
    }
    var maxCount = -1
    var now = 0
    for (i in map.values) {
        now += i
        maxCount = max(now, maxCount)
    }
    println(maxCount)
}