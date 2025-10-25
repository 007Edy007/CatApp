fun main() {
    val binnie = Cat("Binnie", 10, 10)
    val clyde = Cat("Clyde", 5, 5)
    val flathead = Cat("Flathead", 7, 10)
    val cupra = Cat("Cupra", 2, 7)
    binnie.walk()
    clyde.walk()
    flathead.eat(11)

    cupra.walk(4)

    println(binnie)
    println(clyde)
    println(cupra)
    println(flathead)
}