import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val nums =
        br
            .readLine()
            .trim()
            .split(" ")
            .map { it.toInt() }
    val set: List<Int> =
        br
            .readLine()
            .trim()
            .split(" ")
            .map { it.toInt() }
            .toHashSet()
            .sorted()
    var count = 0
    for (i in set.size - 1 downTo 0) {
        if (count == nums[1])
            {
                break
            }
        print("${set.get(i)} ")
        count++
    }
}