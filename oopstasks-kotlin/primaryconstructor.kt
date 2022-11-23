package oops

fun main(args: Array<String>) {
    var person=Person("Raj",25)
    person.displayPersonInfo()

}

class Person(name:String,age:Int){

    var name:String=name
    var age:Int=age

    init {
        println("Initializer Block")
    }

    fun displayPersonInfo(){
        println("Name: $name Age: $age")
    }
}