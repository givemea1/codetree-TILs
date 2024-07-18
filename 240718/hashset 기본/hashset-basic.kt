import java.io.*
import kotlin.collections.*

val set = HashSet<Int>()

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val num = br.readLine().toInt()
    for (i in 0 until num) {
        val command =
            br
                .readLine()
                .trim()
                .split(" ")
                .toTypedArray()
        when (command[0]) {
            "find" -> {
                println(set.contains(command[1].toInt()))
            }
            "add" -> set.add(command[1].toInt())
            "remove" -> set.remove(command[1].toInt())
        }
    }
}