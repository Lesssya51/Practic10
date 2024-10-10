fun isAnagram(str1: String, str2: String): Boolean {
    // Проверяем, равны ли длины строк
    if (str1.length != str2.length) {
        return false
    }

    // Создаем карту символов для первой строки
    val charMap = mutableMapOf<Char, Int>()
    for (char in str1) {
        charMap[char] = charMap.getOrDefault(char, 0) + 1
    }

    // Проверяем наличие каждого символа из второй строки в карте
    for (char in str2) {
        if (!charMap.containsKey(char) || charMap[char] == 0) {
            return false
        }
        charMap[char] = charMap[char]!! - 1
    }

    // Если все символы из второй строки были найдены в карте,
    // то строки являются анаграммами
    return true
}

fun main() {
    val str1 = "listen"
    val str2 = "silent"
    println("Are '$str1' and '$str2' anagrams? ${isAnagram(str1, str2)}")

    val str3 = "hello"
    val str4 = "world"
    println("Are '$str3' and '$str4' anagrams? ${isAnagram(str3, str4)}")
}