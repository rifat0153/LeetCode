
fun plusOne(digits: IntArray): IntArray {
    val result = digits.toMutableList()

    val arraySize = result.size - 1
    result[arraySize] = (result[arraySize] + 1) % 10
    var hasExtra = result[arraySize] == 0

    for (i in arraySize - 1 downTo 0) {
        if(hasExtra) {
            val newVal = (result[i] + 1) % 10
            result[i] = newVal

            hasExtra = newVal == 0
        }
    }

    if(hasExtra) {
        result.add(0, 1)
    }
    return  result.toIntArray()
}


fun main() {
    val digits = intArrayOf(1, 2, 3)
//    val digits = intArrayOf(4,3,2,1)
//    val digits = intArrayOf(9)
//    val digits = intArrayOf(8,9,9,9)
    println(plusOne(digits).contentToString())
}