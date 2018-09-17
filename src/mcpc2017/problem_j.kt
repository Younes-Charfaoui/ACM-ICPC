package mcpc2017

fun main(args: Array<String>) {
    val tests = readLine()!!.toInt()

    for (i in 1..tests) {
        val numbers = readLine()?.split(" ")
        val n = numbers?.get(0)?.toInt()!!
        val k = numbers.get(1).toInt()
        val result = (n-k)*k + plusTorial(n-k)
        println(result)
    }

}

fun plusTorial(number: Int): Int {
    var result = 0
    for (i in 0 until number) {
        result+=i
    }
    return result
}