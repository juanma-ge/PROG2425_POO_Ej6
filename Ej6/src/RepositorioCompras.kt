class RepositorioCompras {
    private val compras = mutableListOf<Compra>()

    // Método para agregar una compra al repositorio
    fun agregarCompra(compra: Compra) {
        compras.add(compra)
    }

    // Método que retorna los domicilios de cada cliente (sin repetidos)
    fun domicilios(): Set<String> {
        return compras.map { it.cliente.domicilio.dirCompleta() }.toSet()
    }
}