fun act1(a:Int,b:Int,c:Int){

    if(a == b && b == c){
        print("Los 3 numeros son iguales $a")
    } else

        if(a > b && a > c){
            print("El numero mayor es : $a")
        }else if(a == b){
            print("Dos numeros son iguales  $a y  $b")
        } else if(a == c){
            print("Dos numeros son iguales  $a y  $c")
        } else
            if(b > c && b > a){
                print("El numero mayor es : $b")
            }else if(b == c){
                print("Dos numeros son iguales  $b y  $c")
            } else if(b == a){
                print("Dos numeros son iguales  $b y  $a")
            } else
                if(c > a && c > b){
                    print("El numero mayor es : $c")
                }else if(c == a){
                    print("Dos numeros son iguales  $c y  $a")
                } else if(c == b){
                    print("Dos numeros son iguales  $c y  $b")
                }

}

//---------------------------------------

fun act2(a: Double, b:Boolean){
    //a = monto total b=Es cliente frecuente
    if(b == true){
        print("El cliente es frecuente ")
        if(a >= 500){
            print("Se aplico un descuento del 25%, el monto total es " + (a - (a*.25)))
        } else if (a >= 200){
            print("Se aplico un descuento del 15%, el monto total es " + (a - (a*.15)))
        } else if (a >= 50){
            print("Se aplico un descuento del 10%, el monto total es " + (a - (a*.10)))
        } else if (a < 50){
            print("Se aplico un descuento del 5%, el monto total es " + (a - (a*.05)))
        }
    } else {
        print("El cliente no es frecuente")
        if(a >= 500){
            print("Se aplico un descuento del 15%, el monto total es " + (a - (a*.15)))
        } else if (a >= 200){
            print("Se aplico un descuento del 10%, el monto total es " + (a - (a*.10)))
        } else if (a < 200){
            print("El monto total es $a")
        }
    }
}

//---------------------------------------

fun act3(a: Double, b: String){

    //a = Calificacion b=Materia
    if(a>100 || a < 0){
        print("Nota Invalida, la calificacion tiene que estar entre 0 a 100")
    } else if(a >= 90 && a <= 100){
        print("Curso : $b Su nota fue de $a , Nota A (Exelente)")
    } else if (a >= 80 && a <= 89.9){
        print("Curso : $b Su nota fue de $a , Nota B (Notable)")
    } else if (a >= 70 && a <= 79.9){
        print("Curso : $b Su nota fue de $a , Nota C (Aprobado)")
    } else if (a >= 60 && a <= 69.9){
        print("Curso : $b Su nota fue de $a , Nota D (Aprobado Minimo)")
    } else if (a >= 0 && a <= 59.9){
        print("Curso : $b Su nota fue de $a , Nota F (Reprobado)")
    }

}