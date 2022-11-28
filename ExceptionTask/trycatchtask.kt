package exception

import java.lang.Exception
import java.util.InputMismatchException
import java.util.*
fun main(args: Array<String>){
    try {
        var read = Scanner(System.`in`)
        println("Enter num1:")
        var number1 = read.nextInt()
        println("Enter num2:")
        var number2 = read.nextInt()
        try {
            var res = number1 / number2
            println("The result is: $res")
        } catch (e: ArithmeticException) {
            println("Number2 value should not be zero")
        }
    }
    catch(e:InputMismatchException) {
        println("Enter only Number")
    }
}