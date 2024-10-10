import kotlin.random.Random

fun generatePassword(length: Int): String {
    val characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&()_+-={}[]|;':\",./<>?"
    val password = StringBuilder()

    repeat(length) {
        val randomIndex = Random.nextInt(characters.length)
        password.append(characters[randomIndex])
    }

    return password.toString()
}

fun main() {
    println("Введите желаемую длину пароля: ")
    val length = readLine()!!.toInt()

    val password = generatePassword(length)
    println("Сгенерированный пароль: $password")
}