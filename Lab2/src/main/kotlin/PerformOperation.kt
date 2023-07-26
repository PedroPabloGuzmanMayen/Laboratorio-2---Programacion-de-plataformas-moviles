fun operation(num1: Int, num2: Int ,operation:(Int, Int) -> Int ): Int = operation(num1,num2)
fun main(){
    val sum = {num1: Int, num2:Int -> num1+num2}
    val sub = {num1: Int, num2: Int -> num1-num2}
    println(operation(3,4, sum))
    println(operation(3,4, sub))
}