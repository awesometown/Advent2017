package ca.uptoeleven.advent2017.day2

object Day2Part1 {

    fun checksum(spreadsheet: List<List<Int>>) : Int {
        return spreadsheet.sumBy { it -> checksumRow(it) }
    }

    fun checksumRow(lineValues: List<Int>) : Int {
        check(lineValues.isNotEmpty())
        val min = lineValues.min()!!
        val max = lineValues.max()!!
        return max - min
    }
}