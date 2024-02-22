package com.aripov.unittesting

import com.androiddevs.unittesthomework.Homework
import com.google.common.truth.Truth.assertThat
import org.junit.Test

class HomeworkTest {
    @Test
    fun `fibonacci  sequence 5th number`() {
        val result = Homework.fib(5)
        assertThat(result).isEqualTo(5)
    }
    @Test
    fun `fibonacci  sequence 12th number`() {
        val result = Homework.fib(12)
        assertThat(result).isEqualTo(144)
    }
    @Test
    fun `fibonacci  sequence 25th number`() {
        val result = Homework.fib(25)
        assertThat(result).isEqualTo(75025)
    }
    @Test
    fun `fibonacci  sequence 50th number`() {
        val result = Homework.fib(50)
        assertThat(result).isEqualTo(12586269025)
    }
    @Test
    fun `valid case returns true`() {
        val result = Homework.checkBraces("(a+b)")
        assertThat(result).isTrue()
    }
    @Test
    fun `valid case with extra parenthesis returns true`() {
        val result = Homework.checkBraces("((a+b))")
        assertThat(result).isTrue()
    }
    @Test
    fun `empty sting returns false`() {
        val result = Homework.checkBraces("")
        assertThat(result).isFalse()
    }
    @Test
    fun `only parenthesis returns true`() {
        val result = Homework.checkBraces("()")
        assertThat(result).isTrue()
    }
    @Test
    fun `extra parenthesis at beginning returns false`() {
        val result = Homework.checkBraces("((a+b)")
        assertThat(result).isFalse()
    }
    @Test
    fun `extra parenthesis at end returns false`() {
        val result = Homework.checkBraces("(a+b))")
        assertThat(result).isFalse()
    }
}