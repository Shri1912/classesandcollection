package collections

fun main() {
    var javaBatch= mutableListOf<String>("Anil","Gopal","Ankith","Manish")
    var kotlinBatch= mutableListOf<String>("Ankith","Kumar","Manish","Rahul")

    javaBatch.removeAll(kotlinBatch)
    println(javaBatch)

    javaBatch.addAll(kotlinBatch)
    println(javaBatch)

    javaBatch.sort()
    println(javaBatch)

}