import utils.CalculateAreaUtils

class App {
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
            1. Calculate Rectangle Area
            2. Calculate Circle Area
            3. Calculate Triangle Area
            ======================================
            Enter menu (1/2/3)
            ======================================
        """.trimIndent())
    }

    fun openMenu(menu: String){
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
        println("Area of rectangle is ${CalculateAreaUtils.calculateAreaRectangle(length, width)}")
    }

    private fun openMenuCircle(){
        println("Enter radius = ")
        val radius = readLine()?.toInt() ?: 0
        println("Area of rectangle is ${CalculateAreaUtils.calculateAreaCircle(radius)}")
    }

    private fun openMenuTriangle(){
        println("Enter base = ")
        val base = readLine()?.toInt() ?: 0
        println("Enter height = ")
        val height = readLine()?.toInt() ?: 0
        println("Area of rectangle is ${CalculateAreaUtils.calculateAreaTriangle(base, height)}")
    }
}