package com.aripov.unittesting

object RegistrationUtil {
    private val existingUsers = listOf("John", "Benjamin")
    /**
     * the registration is not valid if...
     * ...the input username or password is empty.
     * ...the username is already taken.
     * ...the password does not match confirmedPassword.
     * ...the password contains less than 2 digits.
    */
    fun validRegistrationInput(
        username: String,
        password: String,
        confirmedPassword: String
    ): Boolean {
        if(username.isEmpty() || password.isEmpty()){
            return false
        }
        if(username in existingUsers) {
            return false
        }
        if(password != confirmedPassword) {
            return false
        }
        if(password.count { it.isDigit() } < 2) {
            return false
        }
        return true
    }
}