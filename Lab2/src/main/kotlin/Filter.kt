fun oddnumbers(list: List<Int>): List<Int> = list.filter{it%2 != 0} //Definir la funcion que filtra los datos

fun main(){
    var lista = listOf(1,2,3,4,5,6,7,8)
    println(oddnumbers(lista)) //Filtrar los datos de la lista dada
}