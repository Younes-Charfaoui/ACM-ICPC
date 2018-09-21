package mcpc2017

fun main(args: Array<String>) {
    val test = readLine()!!.toInt()

    for (i in 0 until test) {
        val a = readLine()?.toInt()!!
        val b = readLine()?.toInt()!!
        val c = readLine()?.toInt()!!
        val d = readLine()?.toInt()!!
        val first = readLine()!!
        val second = readLine()!!
        var result = 0
        for (j in 0 until first.length) {
            if (first[j].isUpperCase() && second[j].isUpperCase()) {
                if (first[j] != second[j]) result += b
            } else if (first[j].isLowerCase() && second[j].isLowerCase()) {
                if (first[j] != second[j]) result += a
            } else {

                if (first[j].isLowerCase()) {
                    result += c
                    if (first[j].toUpperCase() != second[j])  result += a

                } else {
                    result += d
                    if (first[j].toLowerCase() != second[j])  result += b
                }
            }
        }

        println(result)
    }
}