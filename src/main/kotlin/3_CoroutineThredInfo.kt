import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.joinAll
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) = runBlocking{
    println("Coroutines.....")
    joinAll(
        async { coroutineThreadInfo(1,1000) },
        async { coroutineThreadInfo(2, 500) }
    )
}

suspend fun coroutineThreadInfo(number: Int, delay: Long){
    println("start corotinue $number Thread info ${Thread.currentThread().name}")
    delay(delay)
    println("end corotinue $number Thread info ${Thread.currentThread().name}")

}