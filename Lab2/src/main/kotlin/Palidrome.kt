fun isPalidrome(str: String): Boolean = str.toLowerCase() == (str.toLowerCase()).reversed()

fun main(){
    println(isPalidrome("Reconocer"))
}