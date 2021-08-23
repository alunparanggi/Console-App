package shape

abstract class Shape {
    var shapeName: String? = null

    fun printShapeName() {
        println("This is a $shapeName")
    }

    fun calculateAreaAndCircular() {
        println("""
            Area in $shapeName = ${calculateArea()}
            Circular in $shapeName = ${calculateCircular()}
        """.trimIndent())

    }

    abstract fun calculateArea(): Double
    abstract fun calculateCircular(): Double
}