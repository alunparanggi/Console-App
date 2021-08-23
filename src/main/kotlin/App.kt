import shape.Circle
import shape.Rectangle
import shape.Shape
import shape.Triangle
import utils.StarGeneratorUtils

class App {

    private var starGeneratorUtils = StarGeneratorUtils()

    companion object{
        @JvmStatic
        fun main(args: Array<String>){
            App().start()
        }
    }

    fun start(){
        printHeader()
        val menu = readLine() ?: ""
        openMenu(menu)
    }

    private fun printHeader(){
        println("""
            ======================================
            Console App for Calculating Area in 2D
            ======================================
            1. Calculate Rectangle Area and Circular
            2. Calculate Circle Area and Circular
            3. Calculate Triangle Area and Circular
            4. Print Stars
            ======================================
            Enter menu (1/2/3/4)
            ======================================
        """.trimIndent())
    }

    private fun openMenu(menu: String){
        when(menu){
            "1" -> {
                openMenuRectangle()
            }
            "2" -> {
                openMenuCircle()
            }
            "3" -> {
                openMenuTriangle()
            }
            "4" -> {
                openMenuPrintStars()
            }
            else -> {
                println("Invalid menu!")
                start()
            }
        }
    }

    private fun openMenuRectangle(){
        println("Enter length = ")
        val length = readLine()?.toInt() ?: 0
        println("Enter width = ")
        val width = readLine()?.toInt() ?: 0
        printShape(Rectangle(length, width))
    }

    private fun openMenuCircle(){
        println("Enter radius = ")
        val radius = readLine()?.toInt() ?: 0
        printShape(Circle(radius))
    }

    private fun openMenuTriangle(){
        println("Enter base = ")
        val base = readLine()?.toInt() ?: 0
        println("Enter height = ")
        val height = readLine()?.toInt() ?: 0
        println("Enter hypotenuse = ")
        val hypotenuse = readLine()?.toInt() ?: 0
        printShape(Triangle(base, height, hypotenuse))
    }

    private fun openMenuPrintStars(){
        println("Enter total stars (max 20 stars) = ")
        val totalStar = readLine()?.toInt() ?: 0
        starGeneratorUtils.printStars(totalStar)
    }

    private fun printShape(shape: Shape){
        shape.printShapeName()
        shape.calculateAreaAndCircular()
    }
}