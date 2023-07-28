fun mapping(list: List<String>, extra: String):List<String> = list.map{"$extra, $it!"}
fun main(){
    val arr = listOf("Andre", "Juan","Carlos")
    println(mapping(arr, "!Hola"))
}