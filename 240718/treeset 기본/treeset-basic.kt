import java.io.*
import java.util.*
import kotlin.collections.*

val set = TreeSet<Int>()

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
            "add" -> set.add(command[1].toInt())
            "remove" -> set.remove(command[1].toInt())
            "find" -> println(set.contains(command[1].toInt()))
            "lower_bound" ->
                println(
                    set.contains(command[1].toInt()).let {
                        if (it) {
                            command[1].toInt()
                        } else {
                            set.higher(command[1].toInt())
                        }
                    } ?: "None"
                )
            "upper_bound" -> println(set.higher(command[1].toInt()) ?: "None")
            "largest" -> println(if (set.size > 0) set.last() else "None")
            "smallest" -> println(if (set.size > 0) set.first() else "None")
        }
    }
}