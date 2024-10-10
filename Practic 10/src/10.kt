fun longestWord(text: String): String {
    val words = text.split("\\s+".toRegex()).filter { it.isNotBlank() }
    if (words.isEmpty()) {
        throw IllegalArgumentException("Входная строка не может быть пустой или незаполненным отображением.")
    }
        var longestWord = words[0]
        for (word in words) {
            if (word.length > longestWord.length) {
                longestWord = word
            }
        }
        return longestWord
    }
