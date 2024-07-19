import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val priorityQueue = PriorityQueue<Int>()
    val num =
        br
            .readLine()
            .toInt()

    for (i in 0 until num) {
        val nums =
            br
                .readLine()
                .trim()
                .split(" ")
        when (nums[0]) {
            "push" -> priorityQueue.add(nums[1].toInt())
            "size" -> println(priorityQueue.size)
            "empty" -> println(if (priorityQueue.isEmpty()) 1 else 0)
            "pop" -> println(priorityQueue.poll())
            "top" -> println(priorityQueue.peek())
        }
    }
}