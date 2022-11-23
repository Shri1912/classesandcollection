package oops

fun main(args: Array<String>) {

    var student=Student("Sowmya","Computer Science")
    student.displayStudentInfo()
}

class Student(name:String,dept:String){
    var name:String=name
    var dept:String=dept
    var studentInfo:String=""

    init {
        println("InIt block called for printing student Info")
        studentInfo=name+dept
    }

    fun displayStudentInfo(){
        println("Name: $name")
        println("Department: $dept")
        println("Student Ifo: $studentInfo")
    }
}