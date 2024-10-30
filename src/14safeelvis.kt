fun main() {
    val safeText: String? = null

    val safeTextLength = safeText?.length ?: 0

    println("Panjang teks: $safeTextLength")
}
