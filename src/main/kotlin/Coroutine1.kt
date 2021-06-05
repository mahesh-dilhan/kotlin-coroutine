package me.mahesh
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.joinAll
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) = runBlocking{
    println("Coroutines.....")
    joinAll(
        async { coroutine(1,1000) },
        async { coroutine(2, 500) }
    )
}

suspend fun coroutine(number: Int, delay: Long){
    println("start corotinue $number")
    delay(delay)
    println("end corotinue $number")

}