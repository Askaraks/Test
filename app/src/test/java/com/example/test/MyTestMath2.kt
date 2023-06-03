package com.example.test

import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class MyTestMath2 {
    private  var math : MyMath? = null

    @Before
    fun setUp(){
        math = MyMath()
        println("Before")
    }

    @Test
    fun simpleAddCase(){
        assertEquals(4, math?.add(2, 2))
        println("Simple Add Case")
    }

    @Test
    fun simpleSubCase(){
        assertEquals(0, math?.sub(2, 2))
        println("Simple Sub Case")
    }

    @Test
    fun simpleMultCase(){
        assertEquals(4, math?.mult(2, 2))
        println("Simple Mult Case")
    }

    @Test
    fun simpleDivCase(){
        assertEquals(0, math?.div(2, 2))
        println("Simple Div Case")
    }

    @Test
    fun simpleReversCase(){
        assertEquals("AskarandUrmat", math?.reversWords("Askar 1 and3 2Urmat"))
        println("Simple Revers Case")
    }

    @After
    fun tearDown(){
        println("After")
        math = null
    }
}