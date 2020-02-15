fun main () {
    /* dengan val */
    val angkaInt: Int = 7
    val angkaString: String = "Tujuh"

    /* dengan var */
    var angkaVarInt: Int = 7
    var angkaVarString: String = "Tujuh"
    angkaVarInt = 77
    angkaVarString = "Tujuh Tujuh"


    /* atau bisa langsung dengan memberikan valuenya, tanpa perlu
    * menyebutkan tipe datanya
    * contoh : */

    val angkaLangsung = 7 //langsung teridentifikasi Int
    val angkaLangsung2 = "tujuh" //langsung terindentifiasi String

    println(angkaInt)
    println(angkaString)
    println(angkaVarInt)
    println(angkaVarString)
    println(angkaLangsung)
    println(angkaLangsung2)
}