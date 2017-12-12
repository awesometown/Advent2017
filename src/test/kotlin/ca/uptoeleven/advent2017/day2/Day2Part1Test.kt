package ca.uptoeleven.advent2017.day2

import com.google.common.base.Strings
import com.google.common.io.Resources
import org.apache.commons.lang3.StringUtils
import org.junit.Assert.assertEquals
import org.junit.Test
import java.nio.charset.Charset

class Day2Part1Test {

//    5 1 9 5
//    7 5 3
//    2 4 6 8
//    The first row's largest and smallest values are 9 and 1, and their difference is 8.
//    The second row's largest and smallest values are 7 and 3, and their difference is 4.
//    The third row's difference is 6.

    @Test
    fun test1() {
        val input = listOf(5, 1, 9, 5)
        val checksum = Day2Part1.checksumRow(input)
        assertEquals(8, checksum)
    }

    @Test
    fun test2() {
        val input = listOf(7, 5, 3)
        val checksum = Day2Part1.checksumRow(input)
        assertEquals(4, checksum)
    }

    @Test
    fun test3() {
        val input = listOf(2, 4, 6, 8)
        val checksum = Day2Part1.checksumRow(input)
        assertEquals(6, checksum)
    }

    @Test
    fun fullSheetTest() {
        val input = listOf(
                listOf(5, 1, 9, 5),
                listOf(7, 5, 3),
                listOf(2, 4, 6, 8)
        )
        assertEquals(18, Day2Part1.checksum(input))
    }

    @Test
    fun realDeal() {
        val lines = Resources.readLines(Day2Part1.javaClass.getResource("input.txt"), Charset.defaultCharset())
        val sheet = lines.map {line -> StringUtils.split(line, "\t").map {it -> Integer.parseInt(it) } }
        println(Day2Part1.checksum(sheet))
    }
}