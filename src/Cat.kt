class Cat (val name: String, var age: Int, var initilweight: Int) {
var weight:Int = initilweight
    set(value) {
        if (value in 0..20) field = value
        else println("The weight must be between 0 and 20, the cat is to fat")
    }
    fun walk(times: Int = 1) {
        weight = weight-times
    }
    fun eat(times: Int = 1) {
        weight = weight+times
        if (weight > 20) weight = 20
    }

    override fun toString() : String {
        return "Name: $name Age: $age Weight: $weight"
    }




}
