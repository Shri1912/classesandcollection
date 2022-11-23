package oops

fun main(args: Array<String>) { //to initialize the value to the variable we use constructor
    //var car:Car=Car()
    //car.displayCarInfo()
    var car=Car("2018","Black",400000,19000)
    car.displayCarInfo()
    println(car.checkCarStatus())
}

class Car{
    //variables
    //var modelNo:Int=2016
   // var brand:String="Kia"
   // var kilometerDriven:Int=30000

    //methods or functions
    //fun displayCarInfo(){
       // println("$modelNo $brand $kilometerDriven")
    //}

    var modelNo:String=""
    var color:String=""
    var price:Int=0
    var kilometerDriven:Int=0

    constructor(modelNo:String,color:String,price:Int,kilometerDriven:Int){
        this.modelNo=modelNo
        this.color=color
        this.price=price
        this.kilometerDriven=kilometerDriven
    }

    fun checkCarStatus():String{
        if(kilometerDriven<=5000)
            return "car is in new state"
        else if(kilometerDriven>5000 && kilometerDriven<=20000)
            return "car is in good condition"
        else
            return "car is old"
    }

    fun displayCarInfo(){
        println("$modelNo $color $price $kilometerDriven")
    }
}