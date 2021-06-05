import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.joinAll
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

fun main(args: Array<String>) = runBlocking{
    println("Routines.....")
    routine(1,1000)
    routine(2, 500)
    println("Routines ends.....")
}

fun routine(number: Int, delay: Long){
    thread {
        println("start corotinue $number")
        Thread.sleep(delay)
        println("end corotinue $number")
    }
}