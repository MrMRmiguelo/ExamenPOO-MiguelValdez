enum class status {
    Detenido,Subir,Bajar
}
open class ElevatorClass (var piso: Int) {
var estado: Int = 1
    var elevador: Int = 0
    var leer: Int = 0
  open fun peticion()
  {
      println("Ingrese al piso que desea ir:")
      leer = readLine()?.toInt() as Int
      elevador == leer
  }
open fun EstadoElevador()
{
    peticion()
    while(true)
    {
        if(leer > elevador)
        {
        elevadorsubir()
        }
        else if(leer < elevador)
        {
            elevadorbajar()
        }
        else if(leer == elevador)
        {
            detenido()
        }
    }
}


    open fun show() {
        println("\n El Piso en el que esta es $piso")
    }
    open fun detenido()
    {
        println("El elevador ha llegado a su destino")
    }
    open fun elevadorbajar()
    {
        println("Estado del elevador ABAJO, piso $estado")
        while(estado != elevador) {
            while (estado >= elevador) {
                estado--
                Thread.sleep(1000)
                println("Estado del elevador ABAJO, piso $estado")

            }
        }
        detenido()

    }
open fun elevadorsubir()
{

        println("Estado del elevador ARRIBA, piso $estado")
    while(estado != elevador
        ) {
        while (estado >= elevador) {
            estado++
            Thread.sleep(1000)
            println("Estado del elevador ARRIBA, piso $estado")

        }
 detenido()
    }
}


}
