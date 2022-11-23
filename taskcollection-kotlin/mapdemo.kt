package collections

fun main() {

    var players= mutableMapOf<String,String>()

    players.put("Scahin","Batsman")
    players.put("Dravid","Batsman")
    players.put("Dhoni","Wicket keeper")
    players.put("Shami","Bowler")
    players.put("Bumrah","Bowler")
    players.put("Dhoni","Coach")

    println(players)
    println("Size of the Map: ${players.size}")

    println("Keys: ${players.keys}")
    println("Value: ${players.values}")

    println("Both key and value: ${players.entries}")


}