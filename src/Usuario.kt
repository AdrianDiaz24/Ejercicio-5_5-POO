sealed class Usuario{

    data class Profesor(val id: String, val nombre: String, val departamento: String)
    data class Estudiante(val id: String, val nombre: String, val carrera: String)
    data class Visitante(val id: String, val nombre: String)

    fun pedirLibro(usuario: Usuario, libro: Libro){
        when (usuario) {
            is Usuario.Profesor -> println("Libro: ${libro.titulo} alquilado 30 dias")
            is Usuario.Estudiante -> println("Libro: ${libro.titulo} alquilado 15 dias")
            is Usuario.Visitante -> println("Un visitante no puede alquilar libros")
            else -> {}
        }
    }

}