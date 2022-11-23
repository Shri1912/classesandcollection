package oops

import java.util.Scanner

fun main(args: Array<String>) {
    var scan=Scanner(System.`in`)
    println("Enter the number1:")
    var num1=scan.nextInt()
    println("Enter the number2:")
    var num2=scan.nextInt()
    var calculation=Calculation(num1,num2)
    println("-----------------------------")
    println("Select the option:\n1.Add\n2.Subtract\n3.Multiply\n4.Division\n")
    var choice=scan.nextInt()
    when(choice){
        1->calculation.add()
        2->calculation.subtract()
        3->calculation.multiply()
        4->calculation.divide()
        else-> println("Enter the correct choice")
    }

}

class Calculation(num1:Int,num2:Int){
    var num1:Int=num1
    var num2:Int=num2

    fun add(){
        println("Add: ${num1+num2}")
    }

    fun subtract() {
        println("Subtraction: ${num1-num2}")
    }

    fun multiply(){
        println("Multiplication: ${num1*num2}")
    }

    fun divide() {
        println("Division: ${num1 / num2}")
    }
}