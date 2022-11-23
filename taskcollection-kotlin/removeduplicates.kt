package collections

fun main() {
    var num1= mutableListOf<Int>(1,2,3,4,2,1)
    println(num1)

    var numswithoutduplicate=num1.toSet()
    println(numswithoutduplicate)
}