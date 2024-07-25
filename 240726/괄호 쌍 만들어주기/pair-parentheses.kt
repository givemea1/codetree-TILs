import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val arr =
        br
            .readLine()
            .split("")
            .filter { !it.equals("") }
            .toTypedArray()
    var r = IntArray(100000)
    for (i in arr.size - 2 downTo 0) {
        if (arr[i] == ")" && arr[i + 1] == ")") {
            r[i] = r[i + 1] + 1
        } else {
            r[i] = r[i + 1]
        }
    }
    var result = 0L
    for (i in 0 until arr.size - 2) {
        if (arr[i] == "(" && arr[i + 1] == "(") {
            result += r[i + 2]
        }
    }
    println(result)
}