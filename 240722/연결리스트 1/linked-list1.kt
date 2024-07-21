import java.io.*
import java.util.*

val list = LinkedList<String>()

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    list.add(br.readLine())
    var cur = 0
    val n = br.readLine().toInt()
    for (i in 0 until n) {
        val now = br.readLine().trim().split(" ")
        when (now[0]) {
            "1" -> {
                list.addFirst(now[1])
                cur++
                printResult(cur)
            }
            "2" -> {
                list.add(cur + 1, now[1])
                printResult(cur)
            }
            "3" -> {
                if (cur > 0) {
                    cur--
                }
                printResult(cur)
            }
            "4" -> {
                if (cur < list.size - 1) {
                    cur++
                }
                printResult(cur)
            }
        }
    }
}

fun printResult(num: Int) {
    for (i in num - 1..num + 1) {
        if (i < 0 || i >= list.size) {
            print("(Null) ")
        } else {
            print("${list[i]} ")
        }
    }
    println()
}