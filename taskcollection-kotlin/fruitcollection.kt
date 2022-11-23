package collections

fun main(args: Array<String>) {
    var fruits= mutableListOf<String>("Apple","Mango","Banana","Cherry")
    println(fruits)

    println()

    fruits.add("Strawberry")
    println(fruits)
}