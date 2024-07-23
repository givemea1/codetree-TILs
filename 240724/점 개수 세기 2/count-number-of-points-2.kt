import java.io.*

var count = 0

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val nums =
        br
            .readLine()
            .trim()
            .split(" ")
            .map { it.toInt() }
    var arr = Array(nums[0]) { IntArray(2) { 0 } }
    for (i in 0 until nums[0]) {
        arr[i] =
            br
                .readLine()
                .trim()
                .split(" ")
                .map { it.toInt() }
                .toIntArray()
    }
    val hashMap = HashMap<Int, IntArray>()
    for (i in 0 until nums[0]) {
        hashMap.put(i + 1, arr[i])
    }

    for (i in 0 until nums[1]) {
        var count = 0
        val square =
            br
                .readLine()
                .trim()
                .split(" ")
                .map { it.toInt() }
                .toIntArray()
        for (i in hashMap) {
            if (square[0] <= i.value[0] && square[2] >= i.value[0] && square[1] <= i.value[1] && square[3] >= i.value[1]) {
                count++
            }
        }
        println(count)
    }
}