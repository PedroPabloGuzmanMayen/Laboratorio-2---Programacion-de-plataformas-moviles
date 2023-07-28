fun operation(num1: Int, num2: Int ,operation:(Int, Int) -> Int ): Int = operation(num1,num2) //Definir la funcion que recibe otra funcion  como parámetro
fun main(){
    val sum = {num1: Int, num2:Int -> num1+num2}
    val sub = {num1: Int, num2: Int -> num1-num2}
    val mul = {num1: Int, num2: Int -> num1*num2}
    val div = {num1: Int, num2: Int -> num1/num2}
    val mod = {num1: Int, num2: Int -> num1%num2}
    var condition: Boolean = true

    while (condition){
        println("Bienvenido, en este programa puedes realizar las siguientes operaciones entre 2 enteros:  ")
        println("Opcion 1: Suma")
        println("Opcion 2: Resta")
        println("Opcion 3: Multiplicación")
        println("Opcion 4: División")
        println("Opcion 5: Módulo")
        println("Presionando 6 puedes salir del programa")
        println()
        println("¿Qué deseas hacer?")
        val option: Int = readLine()?.toInt()?:0
        println("Ingresa el primer entrero: ")
        val num1: Int = readLine()?.toInt()?:0
        println("Ingresa el siguiente entero: ")
        val num2: Int = readLine()?.toInt()?:0
        when(option){
            1->{
               println(operation(num1, num2, sum))
            }
            2->{
                println(operation(num1, num2, sub))
            }
            3->{
                println(operation(num1, num2, mul))
            }
            4->{
                println(operation(num1, num2, div))
            }
            5->{
                println(operation(num1, num2, mod))
            }
            6->{
                println("Gracias por usar el programa")
            }
            else ->{
                println("Opcion no válida, intenta otra vez")
            }
        }
    }
}