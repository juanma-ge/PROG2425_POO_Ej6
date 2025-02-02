data class Domicilio(val calle: String, val numero: Int) {
    // Método que retorna el domicilio completo en formato de texto
    fun dirCompleta(): String {
        return "$calle $numero"
    }
}