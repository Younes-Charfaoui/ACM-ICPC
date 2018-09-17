package mcpc2017

fun main(args: Array<String>) {
    // use test cases : hello,world,damn,speak -> should give you 2
    // use test cases : car,the,age,in-> should give you 3
    val tests = readLine()!!.toInt()

    for (i in 1..tests) {
        val word = readLine()!!.toInt()
        val list = mutableListOf<String>()
        for (j in 0 until word) {
            list.add(readLine()!!)
        }
        var result = 0
        for (j in 0 until list.size) {
            for (k in j + 1 until list.size) {
                if (countVowel(list[j]) == countVowel(list[k])) result++
            }
        }
        println(result)
    }
}

fun countVowel(word: String): Int {
    var result = 0
    for (i in 0 until word.length) {
        if ("aeiou".contains(word[i].toString())) result++
    }
    return result
}
