/* Sebelum membahas val dan var ada baiknya kita
* bahas dulu apa itu mutable dan imutable pada kotlin
* karena kedepannya konsep ini akan terus kepake saat kita
* ngoding dengan kotlin
*
* Mutable adalah sebuah varible yang bisa dirubah nilainya atau reassign
* Immutable adalah sebuah variable yang tidak bisa dirubah nilainya */

fun main () {
    val mata = 2
    println("Mata manusia ada " + mata)

    var umur = 20
    umur = 22
    println("Umur saya adalah " + umur)
}