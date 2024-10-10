fun main() {
    print("Введите строку: ")
    val inputString = readLine()!!.lowercase()

    var vowelCount = 0
    var consonantCount = 0

    for (char in inputString) {
        if (char.isLetter()) {
            if (char in "aeiouy") {
                vowelCount++
            } else {
                consonantCount++
            }
        }
    }

    println("Количество гласных: $vowelCount")
    println("Количество согласных: $consonantCount")
}