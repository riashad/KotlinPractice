/**
 * Created by Lenovo on 6/1/2017.
 */

package demo1

fun main (args : Array<String>){
    println("Hello Kotlin!")

    // Kotlin auto detects variable type
    var myName = "Riashad"
    var myAge = 26

    // You can specify Variable type
    var bigInt :Int = Int.MAX_VALUE
    var minInt :Int = Int.MIN_VALUE

    println("Biggest Integer is "+bigInt) // concat with +
    println("Smallest Integer is $minInt") // use $ to concat inside ""

}