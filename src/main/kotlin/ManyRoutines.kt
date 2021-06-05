package me.mahesh
import kotlinx.coroutines.*

fun main(args: Array<String>) = runBlocking<Unit>{
    repeat(1_000_000){
        launch {
            delay(5000)
            print(".")
        }
    }
}

