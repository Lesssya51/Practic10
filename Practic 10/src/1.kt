import kotlin.random.Random

fun main(){
    for (i in 1..10){
        val randomNumber=Random.nextInt(1,101)
        println(randomNumber)
    }
}