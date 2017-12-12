package ca.uptoeleven.advent2017.day1

import com.google.common.io.Resources
import org.junit.Assert.assertEquals
import org.junit.Test
import java.nio.charset.Charset

class Day1Test {

    @Test
    fun test1() {
        val input = "1122"
        assertEquals(3, Day1.sum(input))
    }

    @Test
    fun test2() {
        val input = "1111"
        assertEquals(4, Day1.sum(input))
    }

    @Test
    fun test3() {
        val input = "1234"
        assertEquals(0, Day1.sum(input))
    }

    @Test
    fun test4() {
        val input = "91212129"
        assertEquals(9, Day1.sum(input))
    }

    @Test
    fun realValue() {
        val input = Resources.toString(this.javaClass.getResource("input.txt"), Charset.defaultCharset())
        println(Day1.sum(input))
    }
}

