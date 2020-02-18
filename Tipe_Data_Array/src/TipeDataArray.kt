fun main() {

    /* Array adalah kumpulan beberapa koleksi
    atau kumpulan beberapa data yang dijadikan 1
    datanya bisa dicampur antara Int, String, dll*/

    var nama = arrayOf("orang1", "orang2", "orang3")
    /* Melihat isi dalam array dengan metode toList */
    println(nama.toList())

    /* Melihat isi array berdasarka indeks */
    println(nama[2])
    println(nama.get(1))

    /* Mengubah indeks dalam array (Perhatikan Mutable & Immutable)
    * array bisa dirubah kareana mutable */
    nama[0] = "orang Ganteng" // dengan metode urutan indeks
    nama.set(1, "orang Ganteng 2") // dengan metode set
    println(nama.toList())

    var angka = intArrayOf(103, 65, 88, 198)
    println(angka.toList())

    /* Melihat nilai max dalam array */
    println(angka.max())

    /* Melihat nilai min dalam array */
    println(angka.min())

    /* Melihat nilai rata rata */
    println(angka.average())

    /* Melihat index terkhir dalam array*/
    println(angka.lastIndex)
}