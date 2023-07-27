import kotlin.random.Random

fun main(){
    val random = Random(System.currentTimeMillis())
    println(random.nextInt(100_000, 1_000_000))
}