package mcpc2017

fun main(args: Array<String>) {

    val test = readLine()?.toInt()!!

    for (i in 0 until test) {
        val number = readLine()?.toInt()!!
        var bool = true
        for (j in 0 until number.toString().length) {
            if (number.toString()[j].toString().toInt() != count(number, j)) bool = false
        }
        if (bool) println("self-describing") else println("not self-describing")
    }
}

fun count(number: Int, digit: Int): Int {
    var result = 0
    val data = number.toString()
    for (i in 0 until data.length) {
        val `in` = data[i].toString().toInt()
        if (digit == `in`) {
            result++
        }
    }
    return result
}