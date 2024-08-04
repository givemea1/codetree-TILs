import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val num = br.readLine().toLong()
    var count = 0L
    var now = 1L
    while (true) {
        if (now % 3 != 0L && now % 5 != 0L) {
            count++
            if (count == num) {
                println(now)
                break
            }
        }
        now++
    }
}