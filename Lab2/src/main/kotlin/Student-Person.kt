data class Person(val name: String?, val age: Int, val gender: String?)
data class Student(val name: String?, val age: Int, val gender: String?, val studentID: String)

fun CreatePerson(personList: MutableList<Person>){

    println("Ingresar el nombre de la persona: ")
    val name: String? = readLine()
    println("Ingresar la edad: ")
    val age: Int = readLine()?.toInt()?:0
    println("Ingresar el genero: ")
    val gender: String? = readLine()
    var person: Person = Person(name, age, gender)
    personList.add(person)
}

fun CreateStudent(person: Person){
    
}

fun return_Student(){

}

fun main(){
    var condition: Boolean = true
    var personList: MutableList<Person>
    var studentList: MutableList<Student>

    while (condition){
        println("Opcion 1: Crear persona")
        println("Opcion 2: Crear estudiante a partir de una persona")
        println("Opcion 3: Ingresar estudiante")
        println("Opcion 4: Salir del programa")
        println()
        val option: Int = readLine()?.toInt()?:0

        when(option){
            1 ->{

            }
            2 ->{

            }
            3 ->{
                condition = false
            }
            4 ->{

            }
            else ->{
                println("Opcion no valida, intenta de nuevo")
            }
        }

    }
}