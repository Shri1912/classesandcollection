package collections

class Product(id:Int,name:String,price:Double){
    var id:Int=id
    var name:String=name
    var price:Double=price

}

fun main() {
    var products= mutableListOf<Product>()
    products.add(Product(1,"Laptop",56800.00))
    products.add(Product(2,"Mobile",87900.00))
    products.add(Product(3,"Keyboard",24000.00))

    for(product in products )
        println("${product.id} ${product.name} ${product.price}")


}