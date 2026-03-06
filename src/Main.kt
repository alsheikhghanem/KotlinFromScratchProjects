fun main() {

    val row: Int = 3
    val column: Int = 4
    val twoDimensionArray: Array<Array<Int>> = Array<Array<Int>>(row) { Array<Int>(column) { 0 } }
    twoDimensionArray[0][0] = 14
    twoDimensionArray[0][1] = 15
    twoDimensionArray[0][2] = 16
    twoDimensionArray.forEach { a ->
        a.forEach { b ->
            println("a:$a, b:$b")
        }
    }
    twoDimensionArray[0][3] = 99
}