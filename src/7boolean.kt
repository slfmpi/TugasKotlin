fun main(){
    var makan = true
    var tidakLapar = false

    if (makan && tidakLapar) {
        println("Agus tidak lapar bu, tapi mau makan.")
    } else if (makan && !tidakLapar) {
        println("Agus kenyang Bu.")
    } else {
        println("Agus main gundu.")
    }

    val kenyang = !tidakLapar
    println("Apakah Agus tidak ingin makan? $kenyang")
}
