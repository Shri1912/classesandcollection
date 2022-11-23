package oops

fun main(args: Array<String>) {

    var employee1=Employee1(2,"Radhika")
    employee1.displayEmployee1Info()
}

class Employee1(id:Int=1,name:String="",dept:String="Bench"){
    var id:Int=id
    var name:String=name
    var dept:String=dept

    fun displayEmployee1Info(){
        println("$id $name $dept")
    }
}