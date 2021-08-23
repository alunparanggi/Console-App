package shape

class Circle(val radius: Int): Shape() {
    init {
        shapeName = "Circle"
    }

    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }

    override fun calculateCircular(): Double {
        return Math.PI * radius * 2
    }

}