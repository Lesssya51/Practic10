fun sortStrings(strings: Array<String>): Array<String> {
    return strings.sortedArray()
}

fun main() {
    val unsortedStrings = arrayOf("23", "22", "21", "20")
    val sortedStrings = sortStrings(unsortedStrings)

    println("Исходный массив: ${unsortedStrings.joinToString(", ")}")
    println("Отсортированный массив: ${sortedStrings.joinToString(", ")}")
}



