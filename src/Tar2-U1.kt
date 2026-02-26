fun act4(dia:Int){
    when (dia){
        1 -> println("Lunes")
        2 -> println("Martes")
        3 -> println("Miercoles")
        else -> println("Sigue Intentando, numero invalido")
    }
}
fun act5(cali:Int){
    when (cali){
        10 -> println("Exelente")
        9 -> println("Muy Bien")
        8 -> println("Bien")
        else -> println("Reprobado")
    }
}
fun act6(semafoto:String){
    when (semafoto){
        "rojo" -> println("Alto")
        "amarillo" -> println("Precaucion")
        "verde" -> println("Avanza")
        else -> println("Color invalido")
    }
}
fun act7(rol:String){
    when (rol){
        "admin" -> println("Acceso Total")
        "user" -> print("Acceso limitado")
        "invitado" -> print("Solo lectura")
        else -> println("Rol desconocido")
    }
}
fun act8(i:Int){
    //Uso de For
    for (i in 1..5){
        println(i)
    }
}
fun act9(mensaje:String,repeticion:Int){
    //mensaje , numero de repeticiones
    for(i in 1..repeticion){
        println(mensaje)
    }
}
