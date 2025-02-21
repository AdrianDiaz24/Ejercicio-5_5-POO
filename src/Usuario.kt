sealed class Usuario{

    data class Profesor(val id: String, val nombre: String, val departamento: String): Usuario()
    data class Estudiante(val id: String, val nombre: String, val carrera: String): Usuario()
    data class Visitante(val id: String, val nombre: String): Usuario()

    fun pedirLibro(usuario: Usuario, libro: Libro){
        when (usuario) {
            is Profesor -> println("Libro: ${libro.titulo} alquilado 30 dias")
            is Estudiante -> println("Libro: ${libro.titulo} alquilado 15 dias")
            is Visitante -> println("Un visitante no puede alquilar libros")
        }
    }

}