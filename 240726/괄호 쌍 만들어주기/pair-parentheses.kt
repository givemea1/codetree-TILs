import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val arr =
        br
            .readLine()
            .trim()
            .split("")
            .toTypedArray()
    var lCount = 0
    var rCount = 0
    for (i in arr.indices - 1) {
        if (arr[i] == "(" && arr[i + 1] == "(")
            {
                lCount++
            } else if (arr[i] == ")" && arr[i + 1] == ")")
            {
                rCount++
            }
    }
    println(lCount * rCount)
}