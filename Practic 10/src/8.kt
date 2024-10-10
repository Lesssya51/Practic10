import kotlin.random.Random

fun main() {
    val randomNumber = Random.nextInt(1, 101)
    var guesses = 0
    println("Добро пожаловать в игру 'Угадай число'!")
    println("Я загадал число от 1 до 100. Попробуйте его угадать.")

    while (true) {
        print("Введите ваше число: ")
        val guess = readLine()?.toIntOrNull()

        if (guess == null) {
            println("Некорректный ввод. Пожалуйста, введите число.")
            continue
        }

        guesses++

        if (guess == randomNumber) {
            println("Поздравляю! Вы угадали число за $guesses попыток!")
            break
        } else if (guess < randomNumber) {
            println("Загаданное число больше.")
        } else {
            println("Загаданное число меньше.")
        }
    }
}