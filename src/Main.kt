import java.io.*
import java.util.*

fun main(args: Array<Int>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */

    for (i in args.indices){
        for (n in i + 1..<args.size) {
            if (args[i] > args[n]) {
                val result = args[i]
                args[i] = args[n]
                args[n] = result
            }
        }
    }
    println(args.contentToString())

    for (i in (args.size)/2..<args.size-1){
        if (i == (args.size)/2){
            val result = args[i]
            args[i] = args[args.size-1]
            args[args.size-1] = result
        } else {
            for (n in i+1..<args.size-1){
                if (args[i] < args[n]){
                    val result = args[i]
                    args[i] = args[n]
                    args[n] = result
                }
            }
        }
    }

    println(args.contentToString())


}
