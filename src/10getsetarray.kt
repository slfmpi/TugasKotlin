fun main(){
    val gunungs = arrayOf("Gunung A", "Gunung B", "Gunung C", "Gunung D")

    gunungs[0] = "Gunung Ayamayam"
    gunungs.set(1, "Gunung Baluran")

    println(gunungs[0])
    println(gunungs.get(1))
    println(gunungs.get(2))
    println(gunungs.get(3))
}