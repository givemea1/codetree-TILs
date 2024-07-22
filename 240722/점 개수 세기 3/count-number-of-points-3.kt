import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val nums =
        br
            .readLine()
            .trim()
            .split(" ")
            .map { it.toInt() }
    var a = 0
    var hashMap = HashMap<Int, Int>()
    br
        .readLine()
        .trim()
        .split(" ")
        .map { it.toInt() }
        .sorted()
        .map {
            hashMap.put(a, it)
            a += 1
        }
    for (i in 0 until nums[1]) {
        var start = -1
        var end = -1
        val n =
            br
                .readLine()
                .trim()
                .split(" ")
                .map { it.toInt() }
        for (j in 0 until hashMap.size) {
            if (hashMap.get(j)!! <= n[0]) {
                start = j
                end = j
                continue
            }
            if (hashMap.get(j)!! <= n[1]) {
                end = j
            }
        }
        println(end - start + 1)
    }
}