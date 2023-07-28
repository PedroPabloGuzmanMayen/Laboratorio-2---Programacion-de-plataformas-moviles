fun mapping(list: List<String>, extra: String):List<String> = list.map{"$extra, $it!"}
fun main(){
    val arr = listOf("Andre", "Juan","Carlos")
    println("Ingresa el mensaje que quieres combinar con la lista: ")
    val word: String? = readLine()
    println(mapping(arr, word.toString()))
}