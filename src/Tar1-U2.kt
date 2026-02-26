//Tar1-U2 -------------- Parte 1 --------------
class Lampara {

    private var encendida: Boolean = false

    fun encender() {
        encendida = true
    }
    fun apagar() {
        encendida = false
    }
    fun estado(): String {
        return if (encendida) "Encendida" else "Apagada"
    }
}

//Tar2-U2
class Semaforo{
    private var color : String = "Rojo"

    fun cambioVerde(){
        color = "Verde"
    }
    fun cambioAmarillo(){
        color = "Amarillo"
    }
    fun cambioRojo(){
        color = "Rojo"
    }
    fun estado() : String {
        return color
    }
}

//Tar3-U2
class Reproductor(){

    private var cancion : String = ""
    private  var reproduciendo : Boolean = false

    fun reproducir(nombreRola : String){
        cancion = nombreRola
        reproduciendo = true
    }
    fun pausar(){
        reproduciendo = false
    }
    fun estado(){
        if (reproduciendo){
            println("reproduciendo $cancion")
        } else {
            println("Sin Musica")
        }
    }

}

//Tar4-U2
class Termometro(){

    private var temperatura : Double = 0.0

    fun subir(grados : Double){
        temperatura += grados
    }
    fun bajar(grados : Double){
        temperatura -= grados
    }
    fun mostrarTemp(): Double{
        return(temperatura)
    }
}

//Tar5-U2
class Puerta (){
    private var abierta : Boolean = false

    fun abrir(){
        abierta = true
    }
    fun cerrar(){
        abierta = false
    }
    fun estado(){
        if (abierta){
            println("Puerta abierta")
        } else {
            println("Puerta cerrada")
        }
    }

}