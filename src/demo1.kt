/**
 * Created by Riashad on 6/1/2017.
 */

package demo1

fun main (args : Array<String>){
    println("Hello Kotlin!")

    /**
     * Kotlin auto detects variable type
     * */
    var myName = "Riashad"
    var myAge = 26

    /**
     * You can specify Variable type
     * */

    //Integer
    var bigInt :Int = Int.MAX_VALUE
    var minInt :Int = Int.MIN_VALUE

    println("Biggest Integer is "+bigInt) // concat with +
    println("Smallest Integer is $minInt\n") // use $ to concat inside ""

    // Double
    var bigDouble :Double = Double.MAX_VALUE
    var minDouble :Double = Double.MIN_VALUE

    println("Biggest Double is $bigDouble")
    println("Smallest Double is $minInt\n")

    // Long
    var bigLong :Long = Long.MAX_VALUE
    var minLong :Long = Long.MIN_VALUE

    println("Biggest Long is $bigLong")
    println("Smallest Long is $minLong\n")

    // Float
    var bigFloat :Float = Float.MAX_VALUE
    var minFloat :Float = Float.MIN_VALUE

    println("Biggest Float is $bigFloat")
    println("Smallest Float is $minFloat\n")

    //Boolean

    if(true is Boolean){
        print("Boolean is True\n")
    }

    //Character

    var letterGrade: Char = 'A'

    /**
     * Simple if ${letterGrade is Char} true or false check
     * */
    println("A is a Character: ${letterGrade is Char}")



}