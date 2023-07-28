import kotlin.random.Random
//Definir las clases
data class Person(val name: String?, val age: Int, val gender: String?)
data class Student(val name: String?, val age: Int, val gender: String?, val studentID: String)
//Esta función crea objetos de tipo person
fun CreatePerson(personList: MutableList<Person>){
    println("Ingresar el nombre de la persona: ")
    val name: String? = readLine()
    println("Ingresar la edad: ")
    val age: Int = readLine()?.toInt()?:0
    println("Ingresar el genero: ")
    val gender: String? = readLine()
    var person: Person = Person(name, age, gender)
    //Agregar el objeto al array
    personList.add(person)
}
//Esta funcion crea objetos tipo estudiante
fun CreateStudent(person: Person, studentList: MutableList<Student>){
    val random = Random(System.currentTimeMillis()) //Generar el ID con números random
    var student: Student = Student(person.name, person.age, person.gender, random.nextInt(100_000, 1_000_000).toString()) //Crear el objeto
    studentList.add(student) //Agregar al array de objetos de estudiantes
}
//Esta función retorna los datos de un estudiante dado el nombre de una persona
fun return_Student(name: String?, studentList: MutableList<Student>){
    var count: Int = 0 //EL contador ayudará a determinar si el nombre ingresado existe
    for (i in studentList){
        //Comprobar si el nombre ingresado existe
        if (i.name == name){
            //Imprimir los datos del estudiante
            println("El estudiante ${i.name} tiene edad ${i.age}, es ${i.gender} y tiene el ID ${i.studentID}")
        }
        else{
            //Si no, agregar uno al contador
            count +=1
        }
    }
    //Si el contador es igual que el tamaño de la lista, significa que el estudiante no existe
    if (count == studentList.size){
        //Indicar que el estudiante no existe
        println("No existe el estudiante")
    }

}

fun main(){
    var condition: Boolean = true //Esta condicion nos ayudara a mantener el ciclo
    var personList: MutableList<Person> = mutableListOf() //Esta lista almacena los objetos tipo Person
    var studentList: MutableList<Student> = mutableListOf() //Esta lista almacena los objetos tipo Student
    var counter: Int = 0 //Este contador nos sirve para determinar si un objeto dado por el usuario existe
    while (condition){
        println("Opcion 1: Crear persona")
        println("Opcion 2: Crear estudiante a partir de una persona")
        println("Opcion 3: Ingresar estudiante")
        println("Opcion 4: Salir del programa")
        println()
        val option: Int = readLine()?.toInt()?:0
        when(option){
            1 ->{
                CreatePerson(personList)
                println("Persona creada exitosamente")
            }
            2 ->{
                println("Ingresa el nombre de la persona de la que quieres crear un estudiante: ")
                val name: String? = readLine()
                var person: Person
                for (i in personList){
                    if (i.name == name){
                        CreateStudent(i, studentList)
                        println("Estudiante creado exitosamente")
                    }
                    else{
                        counter+=1
                    }
                }
                if (counter == studentList.size){
                    counter = 0
                    println("El nombre ingresado no está disponible, intenta de nuevo")
                }
            }
            3 ->{
                println("Ingresa el nombre de la persona de la que quieres obtener sus datos de estudiante: ")
                val name: String? = readLine()
                return_Student(name, studentList)
            }
            4 ->{
                println("Gracias por usar el programa")
                condition = false
            }
            else ->{
                println("Opcion no valida, intenta de nuevo")
            }
        }

    }
}