package mcpc2017

fun main(args: Array<String>) {
    val test = readLine()!!.toInt()

    for (i in 0 until test) {
        val d = readLine()?.toInt()!!
        val a = readLine()?.toInt()!!
        val b = readLine()?.toInt()!!
        val cubeOne = a * a * d
        val cubeTwo = b * b * d
        println("$cubeOne $cubeTwo ${cubeOne + cubeTwo}")
    }
}