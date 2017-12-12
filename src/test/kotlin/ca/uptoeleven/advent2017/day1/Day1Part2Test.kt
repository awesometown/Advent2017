package ca.uptoeleven.advent2017.day1

import com.google.common.io.Resources
import org.junit.Assert
import org.junit.Test
import java.nio.charset.Charset

class Day1Part2Test {
//    1212 produces 6: the list contains 4 items, and all four digits match the digit 2 items ahead.
//    1221 produces 0, because every comparison is between a 1 and a 2.
//    123425 produces 4, because both 2s match each other, but no other digit has a match.
//    123123 produces 12.
//    12131415 produces 4.

    @Test
    fun test1() {
        val input = "1212"
        Assert.assertEquals(6, Day1Part2.sum(input))
    }

    @Test
    fun test2() {
        val input = "1221"
        Assert.assertEquals(0, Day1Part2.sum(input))
    }

    @Test
    fun test3() {
        val input = "123425"
        Assert.assertEquals(4, Day1Part2.sum(input))
    }

    @Test
    fun test4() {
        val input = "123123"
        Assert.assertEquals(12, Day1Part2.sum(input))
    }

    @Test
    fun test5() {
        val input = "12131415"
        Assert.assertEquals(4, Day1Part2.sum(input))
    }


    @Test
    fun realValue() {
        val input = Resources.toString(this.javaClass.getResource("input.txt"), Charset.defaultCharset())
        println(Day1Part2.sum(input))
    }
}