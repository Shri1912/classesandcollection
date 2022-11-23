package oops

fun main(args: Array<String>) {
    var employee=Employee(1,"Ramya",20000.00,5)
    employee.calculatePerDaySalary()
    println(employee.totalSalaryEarned())
}

class Employee{

    var id:Int=0
    var name:String=""
    var salary:Double=0.00
    var numberOfDays:Int=0

    constructor(id:Int,name:String,salary:Double,numberOfDays:Int){
        this.id=id
        this.name=name
        this.salary=salary
        this.numberOfDays=numberOfDays
    }

    fun calculatePerDaySalary():Double{
        return salary/30
    }

    fun totalSalaryEarned():String{
        return "Total Salary: ${numberOfDays*calculatePerDaySalary()}"
    }
}
