package com.aripov.unittesting

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {
    @Test
    fun `valid username and repeated password returns true`() {
        val result = RegistrationUtil.validRegistrationInput(
            "Sirojiddin",
            "1234",
            "1234"
        )
        assertThat(result).isTrue()
    }
    @Test
    fun `username exists returns false`() {
        val result = RegistrationUtil.validRegistrationInput(
            "John",
            "abc1234",
            "abc1234"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validRegistrationInput(
            "",
            "1234",
            "1234"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `empty password returns false`() {
        val result = RegistrationUtil.validRegistrationInput(
            "Hello",
            "",
            ""
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `passwords do not match returns false`() {
        val result = RegistrationUtil.validRegistrationInput(
            "Hello",
            "abc123",
            "123abc"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `passwords do not contain 2 digits return false returns false`() {
        val result = RegistrationUtil.validRegistrationInput(
            "Hello",
            "abc",
            "abc"
        )
        assertThat(result).isFalse()
    }
}