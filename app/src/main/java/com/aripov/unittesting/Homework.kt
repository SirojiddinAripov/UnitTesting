package com.androiddevs.unittesthomework

object Homework {

    /**
     * Returns the n-th fibonacci number
     * They are defined like this:
     * fib(0) = 0
     * fib(1) = 1
     * fib(n) = fib(n-2) + fib(n-1)
     */
    fun fib(n: Int): Long {
        val newN = n+1
        if(newN == 0 || newN == 1) {
            return newN.toLong()
        }
        var a = 0L
        var b = 1L
        var c = 1L
        (1..newN-2).forEach { i ->
            c = a + b
            a = b
            b = c
        }
        return c
    }

    /**
     * Checks if the braces are set correctly
     * e.g. "(a * b))" should return false
     */
    fun checkBraces(string: String): Boolean {
        val left = string.count { it == '(' }
        val right = string.count { it == ')' }
        return left == right && left != 0 && string.indexOf("(") < string.indexOf(")")
    }
}