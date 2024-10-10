fun main() {
    val inputString = "Пример строки для изменения регистра"
    val outputString = inputString.map { if (it.isUpperCase()) it.toLowerCase() else it.toUpperCase() }.joinToString("")

    println("Исходная строка: $inputString")
    println("Измененная строка: $outputString")
}