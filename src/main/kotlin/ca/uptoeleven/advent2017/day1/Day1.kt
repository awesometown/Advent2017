package ca.uptoeleven.advent2017.day1

object Day1 {
    fun sum(digits : String) : Int {
        var sum = 0
        for(i in 0 until digits.length-1) {
            if (digits[i] == digits[i+1]) {
                sum += getVal(digits, i)
            }
        }
        if (digits[0] == digits[digits.length-1]) {
            sum += getVal(digits, 0)
        }
        return sum
    }

    private fun getVal(digits: String, i: Int) = Integer.parseInt(digits[i].toString())
}

object Day1Part2 {

    var length = 0

    fun sum(digits : String) : Int {
        length = digits.length
        var sum = 0
        for (i in 0 until length) {
            if (digits[i] == digits[getMatchedDigit(i)]) {
                sum += getVal(digits, i)
            }
        }
        return sum
    }

    fun getMatchedDigit(curIndex : Int) : Int {
        return (curIndex + (length/2)) % length
    }

    private fun getVal(digits: String, i: Int) = Integer.parseInt(digits[i].toString())
}