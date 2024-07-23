import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val num =
        br
            .readLine()
            .toInt()
    val arr = Array(num) { "" }
    for (i in 0 until num) {
        arr[i] = br.readLine()
    }
    var sLArr = IntArray(num + 1)
    var sRArr = IntArray(num + 1)
    var hLArr = IntArray(num + 1)
    var hRArr = IntArray(num + 1)
    var max = -1
    for (i in 1..num) {
        when (arr[i - 1]) {
            "P" -> {
                hLArr[i] = hLArr[i - 1]
                sLArr[i] = sLArr[i - 1] + 1
            }
            "S" -> {
                hLArr[i] = hLArr[i - 1] + 1
                sLArr[i] = sLArr[i - 1]
            }
            "H" -> {
                sLArr[i] = sLArr[i - 1]
                hLArr[i] = hRArr[i - 1]
            }
        }
    }

    for (i in num - 1 downTo 0) {
        if (i != num) {
            sRArr[i] = sRArr[i + 1]
            hRArr[i] = hRArr[i + 1]
        }
        when (arr[i]) {
            "P" -> {
                sRArr[i]++
            }
            "S" -> {
                hRArr[i]++
            }
        }
    }
    for (i in 0 until num) {
        max = Math.max(max, sLArr[i] + hRArr[num - (num - i)])
        max = Math.max(max, hLArr[i] + sRArr[num - (num - i)])
    }

    println(max)
}