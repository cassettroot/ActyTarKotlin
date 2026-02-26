//Tar1-U2 -------------- Parte 2 --------------
class Descuento {

    var monto: Double = 0.0

    fun calcularDescuento(): Double {
        return when {
            monto < 1000 -> 0.0
            monto in 1000.0..2999.99 -> monto * 0.10
            else -> monto * 0.20
        }
    }

    fun totalAPagar(): Double {
        return monto - calcularDescuento()
    }
}

//Tar2-U2
class Evaluador {

    var calificacion: Int = 0

    fun resultado(): String {
        return when {
            calificacion < 6 -> "Reprobado ;c"
            calificacion in 6..7 -> "Suficiente"
            calificacion in 8..9 -> "Bueno"
            calificacion == 10 -> "Excelente"
            else -> "Calificación inválida"
        }
    }
}

//Tar3-U2
class Propina {

    var consumo: Double = 0.0

    fun calcularPropina(): Double {
        return when {
            consumo < 500 -> consumo * 0.05
            consumo in 500.0..999.99 -> consumo * 0.10
            else -> consumo * 0.15
        }
    }

    fun totalConPropina(): Double {
        return consumo + calcularPropina()
    }
}

//Tar4-U2
class ValidadorEdad {

    var edad: Int = 0

    fun categoria(): String {
        return when {
            edad < 18 -> "Menor de edad"
            edad in 18..64 -> "Adulto"
            else -> "Adulto mayor"
        }
    }
}

//Tar5-U2
class Comparador {

    var numero1: Int = 0
    var numero2: Int = 0

    fun comparar(): String {
        return when {
            numero1 > numero2 -> "El numero 1 es mayor"
            numero2 > numero1 -> "El numero 2 es mayor"
            else -> "Son iguales xd"
        }
    }
}