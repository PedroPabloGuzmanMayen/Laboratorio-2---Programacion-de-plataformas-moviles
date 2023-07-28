fun isPalidrome(str: String): Boolean = str.toLowerCase() == (str.toLowerCase()).reversed()

fun main(){
    println("Ingresa una palabra para determinar si es un palidromo: ")
    val word: String? = readLine()
    println(isPalidrome(word.toString()))
}