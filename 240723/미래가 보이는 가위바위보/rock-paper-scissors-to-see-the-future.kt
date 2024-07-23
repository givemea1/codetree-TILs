import java.io.*
import kotlin.math.*

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
    val hSP = arrayOf("H", "S", "P")
    var lArr = IntArray(num)
    var count = 0
    for (i in 0 until 3) {
        for (j in arr.indices) {
            if (arr[j].equals(hSP[i])) {
                count++
            }
            lArr[j] = max(lArr[j], count)
        }
        count = 0
    }

    var rArr = IntArray(num)
    for (i in 0 until 3) {
        for (j in num - 1 downTo 0) {
            if (arr[j].equals(hSP[i])) {
                count++
            }
            rArr[j] = max(rArr[j], count)
        }
        count = 0
    }
    var maxWin = -1
    for (i in 0 until num - 1) {
        maxWin = max(maxWin, lArr[i] + rArr[i + 1])
    }

    println(maxWin)
}