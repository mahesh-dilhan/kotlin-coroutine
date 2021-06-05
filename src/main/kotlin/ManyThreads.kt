package me.mahesh
import kotlinx.coroutines.*
import kotlin.concurrent.thread

fun main(args: Array<String>) {
    repeat(1_000_000){
        thread {
            Thread.sleep(5000)
            print(".")
        }
    }
}

