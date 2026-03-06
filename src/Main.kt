fun main() {

    val num = Array(4, {i -> i * 2})
    var array = Array(4, { "$it" })
    val element = array[1]
    println(element)
    array[2] = "Update"
    println(array[2])
    val size = array.size
    println(size)
    for (element in element) println(element)
    val found = array.contains(element)
    println(found)
    val subArray = array.slice(0 .. 3)
    subArray.forEach { println(it) }
    array.sort()
    array.joinToString()
}