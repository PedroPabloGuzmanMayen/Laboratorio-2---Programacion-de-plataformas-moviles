fun mapping(list: List<String>):List<String> = list.map{"!Hola, $it!"}
fun main(){
    val arr = listOf("Andre", "Juan","Carlos")
    println(mapping(arr))
}