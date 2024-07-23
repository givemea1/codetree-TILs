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
    var a = 0
    var treeMap = TreeMap<Int, Int>()
    br
        .readLine()
        .trim()
        .split(" ")
        .map { it.toInt() }
        .sorted()
        .map {
            treeMap.put(it, a)
            a += 1
        }
    for (i in 0 until nums[1]) {
        val n =
            br
                .readLine()
                .trim()
                .split(" ")
                .map { it.toInt() }
        println(treeMap.get(n[1])!! - treeMap.get(n[0])!! + 1)
    }
}