import java.io.*
import java.util.*

var count = 0

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val nums =
        br
            .readLine()
            .trim()
            .split(" ")
            .map { it.toInt() }
    val treeSet =
        TreeSet<IntArray> { a, b -> a[0].compareTo(b[0]) }
    for (i in 0 until nums[0]) {
        treeSet.add(
            br
                .readLine()
                .trim()
                .split(" ")
                .map { it.toInt() }
                .toIntArray()
        )
    }

    for (i in 0 until nums[1]) {
        var count = 0
        val square =
            br
                .readLine()
                .trim()
                .split(" ")
                .map { it.toInt() }
                .toIntArray()
        for (i in treeSet) {
            if (square[2] >= i[0]) {
                if (square[0] <= i[0]&&square[1] <= i[1] && square[3] >= i[1]) {
                    count++
                }
            } else {
                break
            }
        }
        println(count)
    }
}