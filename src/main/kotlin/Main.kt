fun main() {
    plusMinus(arrayOf(1, 1, 0, -1, -1))
}

fun plusMinus(arr: Array<Int>) {
    println((arr.filter {
        it > 0
    }.size / arr.size.toFloat()))

    println(arr.filter {
        it < 0
    }.size / arr.size.toFloat())

    println(arr.filter {
        it == 0
    }.size / arr.size.toFloat())
}