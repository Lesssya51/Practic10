fun main() {
    val n = readLine()!!.toInt()

    println("Простые числа до $n:")
    for (i in 2..n) {
        if (isPrime(i)) {
            print("$i ")
        }
    }
}

fun isPrime(num: Int): Boolean {
    if (num <= 1) return false
    for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) {
            return false
        }
    }
    return true
}