import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val priorityQueue = PriorityQueue<Int>(Collections.reverseOrder())
    val num =
        br
            .readLine()
            .toInt()

    for (i in 0 until num) {
        val n = br.readLine().toInt()
        if (n == 0) {
            if (priorityQueue.isNotEmpty())println(priorityQueue.poll()) else println(0)
        } else {
            priorityQueue.add(n)
        }
    }
}