package shape

class Triangle(val base:Int, val height: Int, val hypotenuse: Int): Shape() {
    init {
        shapeName = "Circle"
    }

    override fun calculateArea(): Double {
        return 0.5 * base * height
    }

    override fun calculateCircular(): Double {
        return (base + height + hypotenuse).toDouble()
    }
}