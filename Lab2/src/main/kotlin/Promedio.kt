
fun CalcProm(list: List<Int>): Double = (list.reduce{right,left -> right+left}/list.size).toDouble() //Definir la función que calcula el promedio
fun main() {
    var list = listOf(59,98,86,85,78,91)
    println(CalcProm(list)) //Utlizar la funcion con la lista
}