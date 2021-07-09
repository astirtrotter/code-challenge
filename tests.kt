import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class CodeChallengeTest {
    /**
     * Legionnaries
     *
     * In the range 1 - 13 (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13) the digit 1
     * occurs 6 times.
     *
     * In the range, 1 - 2,660 (half the number of Romans in a legion), expressed in
     * Roman numerals, how many times does the numeral “X” occur?
     */
    @Test
    fun problem1() {
        val Xcount1_9 = 1
        val Xcount1_99 = (Xcount1_9 + 1 + 2 + 3 + 1 + 0 + 1 + 2 + 3 + 1) * 10
        val Xcount1_999 = Xcount1_99 * 10
        val Xcount1_2000 = Xcount1_999 * 2
        val Xcount2001_2600 = Xcount1_99 * 6
        val Xcount2601_2660 = Xcount1_9 * 6 + (1 + 2 + 3 + 1 + 0) * 10 + 1

        println(Xcount1_2000 + Xcount2001_2600 + Xcount2601_2660)
    }

    /**
     * Epigram on Failure
     *
     * Given the following quote by Alan Perlis

     * “Dealing with failure is easy: Work hard to improve. Success is also easy to
     * handle: You’ve solved the wrong problem. Work hard to improve.”
     *
     * Considering only the alphabetical characters, consonants having the value of
     * their ASCII codes, and vowels having the inverse value of their ASCII codes,
     * what is the sum of the sentence?
     *
     * Example:
     * Using the phrase “why and how”, w=119, h=104, y=121, d=100, n=110. A and O are vowels, so a=-97 o=-111.
     * The sum of ‘why and how’ = 569.
     */
    @Test
    fun problem2() {
        val text = "Dealing with failure is easy: Work hard to improve. Success is also easy to handle: You’ve solved the wrong problem. Work hard to improve."
        val vowels = "aeiou"
        val ret = text.sumOf { c ->
            if (c in 'a'..'z' || c in 'A'..'Z') {
                if (vowels.contains(c.lowercaseChar())) {
                    -c.code
                } else {
                    c.code
                }
            } else {
                0
            }
        }
        println(ret)
    }

    /**
     * Fibonacci
     *
     * The Fibonacci sequence begins like this:
     * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
     * (each number is the sum of the previous two)
     *
     * What is the sum of all odd numbers in the Fibonacci sequence that are less
     * than 10,000?
     */
    @Test
    fun problem3() {
        var prev1 = 1
        var prev2 = 0
        var sum = 1
        do {
            val cur = prev1 + prev2
            if (cur >= 10000) break
            if (cur % 2 != 0) sum += cur
            prev2 = prev1
            prev1 = cur
        } while (true)
        println(sum)
    }

    /**
     * Palindromes
     *
     * A palindrome is a word, number, phrase, or another sequence of characters which
     * reads the same backward as forward, such as madam, racecar, or the number 10801.
     *
     * What is the sum of all numeric palindromes that are less than 10,000?
     */
    @Test
    fun problem4() {
        var sum = 0
        for (i in 1..99) {
            if (i < 10 || i % 11 == 0) {
                sum += i
            }

            if (i >= 10) {
                sum += i * 10 + i / 10
                sum += i * 100 + i / 10 + (i % 10) * 10
            }
        }
        println(sum)
    }
}
