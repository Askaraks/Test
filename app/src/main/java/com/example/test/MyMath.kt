package com.example.test

import java.util.Arrays
import java.util.Collections

class MyMath {
    fun add(a: Int, b: Int): Int{
        return a + b
    }
    fun sub(a: Int, b: Int): Int{
        return a - b
    }
    fun div(a: Int, b: Int): Int{
        return a / b
    }
    fun mult(a: Int, b: Int): Int{
        return a * b
    }
    fun reversWords(word: String): String {
        val reversedWords = word.reversed()
        val digitsRemoved = reversedWords.replace("\\d+".toRegex(), "")
        val spacesRemoved = reversedWords.replace("\\s+".toRegex(), "")
        return reversedWords.reversed()

    }
}