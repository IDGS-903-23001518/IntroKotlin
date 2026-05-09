fun main(){
    println("Ingrese x1: ")
    val x1 = readln().toDouble()
 
    println("Ingrese y1: ")
    val y1 = readln().toDouble()
 
    println("Ingrese x2: ")
    val x2 = readln().toDouble()
 
    println("Ingrese y2: ")
    val y2 = readln().toDouble()
 
    val distan = math.sqrt(
        (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)   )
 
    println("La distancia entre los puntos es: $distan")
}