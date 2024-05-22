import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun timeConversion(s: String = "07:05:45PM"): String {
    // Write your code here

    if (s.endsWith("PM")) {
        if (s.substring(0,2).toInt()==12) return s.substring(0,8)
        else return "${s.substring(0, 2).toInt()+12}${s.substring(2,8)}"
    }else {
        if (s.substring(0,2).toInt()==12) return "00${s.substring(2,8)}"
        else return s.substring(0,8)
    }





}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}
