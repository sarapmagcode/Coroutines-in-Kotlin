import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

fun main() {
    val states = arrayOf("Starting", "Doing Task 1", "Doing Task 2", "Ending")
    
    // For every task or process, use a coroutine.
    // Let's say you have 3 tasks, then there will be 3 coroutines which will process them concurrently.
    repeat(3) {
        GlobalScope.launch {
            println("${Thread.currentThread()} has started")
            for (i in states) {
                println("${Thread.currentThread()} - $i")
            }
        }
    }
}
