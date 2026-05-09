import kotlin.math.pow
 
fun mostrarMayor(v1: Int, v2: Int, v3: Int){
    print("Mayor:")
    if (v1 > v2 && v1 > v3)
        println(v1)
    else
        if(v2 > v3)
            print(v2)
        else
            print(v3)
 
}