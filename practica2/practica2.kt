fun main() {
    println("Ingrese el primer numero:")
    val a = readln().toInt()
 
    println("Ingrese el segundo numero:")
    val b = readln().toInt()
 
    var res = 0
 
    for(i in 1..b) {
        res = res + a
    }
 
    println("La multiplicacion de $a por $b es: $res")
}