package collections

fun main(args: Array<String>) {

    var marks= mutableListOf<Int>(20,30,40,50,60)
    println(marks)

    println()

    marks.add(54)
    marks.add(39)

    println(marks)

    println("Size: ${marks.size}")
    println("Contains 20: ${marks.contains(20)}")
    println("Contains 200: ${marks.contains(200)}")

    marks.remove(30)
    println(marks)

    marks.add(1,25)
    println(marks)
}