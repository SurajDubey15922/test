package com.example.githubaction


import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith


internal class OperatorsTest {
    var operators = Operators()


    @Test
    fun add() {
        val result = operators.add(3, 4)
        assertEquals(7, result)
    }

    @Test
    fun sub() {
        val result = operators.sub(8, 4)
        assertEquals(4, result)

    }



}