fun main () {

    /* String + String akan menghasilkan penyambungan String */
    val angka = "7"
    val angka2 = "77"
    println(angka + angka2)

    val nama = "PLUGIN"
    val namaBelakang = "tegal"
    val tgl = 7
    val bulan = "Juli"
    println(nama + " " + namaBelakang+ " " + tgl + " " + bulan)

//    atau

    val namaLengkap = "$nama $namaBelakang"
    println(namaLengkap)

    /* Contoh menghitung panjang karakter & Merubah menjadi UperCase */
    println(namaLengkap.length)
    println(namaBelakang.toUpperCase())
}