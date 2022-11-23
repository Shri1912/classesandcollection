package collections

class Employee(id:Int,name:String,age:Int,dept:String,salary:Double){
    var id:Int=id
    var name:String=name
    var age:Int=age
    var dept:String=dept
    var salary:Double=salary
}

fun main() {
    var employees= mutableListOf<Employee>()
    employees.add(Employee(1,"Shyam",30,"Testing",65000.00))
    employees.add(Employee(2,"Raj",34,"Managing",65900.00))
    employees.add(Employee(3,"Sanjana",28,"Debug",58900.00))
    employees.add(Employee(4,"Radha",27,"Project",75000.00))
    employees.add(Employee(5,"Chethan",45,"Testing",65700.00))

    for(employee in employees)
        println("${employee.id} ${employee.name} ${employee.age} ${employee.dept} ${employee.salary}")
}
