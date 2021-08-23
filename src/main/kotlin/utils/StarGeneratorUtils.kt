package utils

class StarGeneratorUtils {
    fun printStars(totalStars: Int){
        if(totalStars <= 20){
            for(i in 1..totalStars){
                for (j in 1..i){
                    print("*")
                }
                println("")
            }
        } else {
            println("Total stars should not grater than 20")
        }
    }
}