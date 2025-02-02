fun main() {
    val domicilio1 = Domicilio("Calle Las Flores", 355)
    val domicilio2 = Domicilio("Mirasol", 218)
    val domicilio3 = Domicilio("La Mancha", 761)

    val cliente1 = Cliente("Nuria Costa", domicilio1)
    val cliente2 = Cliente("Jorge Russo", domicilio2)
    val cliente3 = Cliente("Julián Rodriguez", domicilio3)

    val compras = listOf(
        Compra(cliente1, "2025-02-01", 100.0),
        Compra(cliente2, "2025-02-02", 200.0),
        Compra(cliente1, "2025-02-03", 150.0),
        Compra(cliente3, "2025-02-01", 300.0),
        Compra(cliente2, "2025-02-04", 250.0)
    )

    val repositorio = RepositorioCompras()
    compras.forEach { repositorio.agregarCompra(it) }

    println(repositorio.domicilios())
}