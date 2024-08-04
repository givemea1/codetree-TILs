import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val num = br.readLine().toInt()
    var five = num / 5
    var result = -1
    while (five > 0) {
        if ((num - five * 5) % 2 == 0) {
            result = five + (num - five * 5) / 2
            break
        }
        five--
    }
    println(result)
}