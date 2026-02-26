    class Calculadora{
        //Atributos

        var valor1 : Double = 0.0
        var valor2 : Double = 0.0
        var resultado : Double = 0.0

        fun sumar() : Double {
            resultado = valor1 + valor2
            return resultado

        }

        fun restar() : Double {
            resultado = valor1 - valor2
            return resultado
        }

        fun multiplicar() : Double {
            resultado = valor1 * valor2
            return resultado
        }

        fun dividir() : Double {
            if (valor1 == 0.0) {
                return 0.0
            }
            resultado = valor1 / valor2
            return resultado
        }

        fun calcular(dato1 : Double, dato2 : Double, opcion : String) : Double {
            valor1 = dato1
            valor2 = dato2
            when(opcion){
                "sumar" -> return sumar()
                "restar" -> return restar()
                "multiplicar" -> return multiplicar()
                "dividir" -> return dividir()

                else -> return 0.0
            }

        }

    }

    class Contador{
        var contador : Int = 0

        fun incrementar(){
            contador += 1
        }
        fun decrementar(){
            contador -= 1
        }

        fun mostrar() : Int {
            return contador
        }

    }