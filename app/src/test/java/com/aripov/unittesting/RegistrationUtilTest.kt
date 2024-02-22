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
        val password = "abc123"
        val confirmedPassword = "123abc"
        val result = RegistrationUtil.validRegistrationInput(
            "Hello",
            password,
            confirmedPassword
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `passwords do not contain 2 digits return false returns false`() {
        val password = "abc"
        val confirmedPassword = "abc"
        val result = RegistrationUtil.validRegistrationInput(
            "Hello",
            password,
            confirmedPassword
        )
        assertThat(result).isFalse()
    }
}