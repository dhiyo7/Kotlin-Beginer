fun main() {

    /* Merubah Tipe Data Int ke String */
    val angka = 1
    val huruf = "1"
    println(angka.toString() + huruf)

    /* Merubah Tipe Data String ke Int */
    val angka2 = 1
    val huruf2 = "1"
    println(angka2 + huruf2.toInt())

    /* Contoh Lagi */
    val angka3 = 10
    val huruf3 = "10.5"
    println(angka3 + huruf3.toDouble())
    println(angka3.toString() + huruf3)
}