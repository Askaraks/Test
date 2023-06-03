package com.example.test

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class MyTestMath {

    @get:Rule
    val rule: ActivityScenarioRule<MainActivity> = ActivityScenarioRule(MainActivity::class.java)
    @Test
    fun additionButtonClickTest() {
        onView(withId(R.id.et_num1)).perform(typeText("2"))
        onView(withId(R.id.et_num2)).perform(typeText("3"))
        onView(withId(R.id.btn_plus)).perform(click())
        onView(withId(R.id.tv_result)).check(matches(withText("5")))
    }

    @Test
    fun subtractionClickTest() {
        onView(withId(R.id.et_num1)).perform(typeText("5"))
        onView(withId(R.id.et_num2)).perform(typeText("3"))
        onView(withId(R.id.btn_minus)).perform(click())
        onView(withId(R.id.tv_result)).check(matches(withText("2")))
    }

    @Test
    fun multiplicationClickTest() {
        onView(withId(R.id.et_num1)).perform(typeText("4"))
        onView(withId(R.id.et_num2)).perform(typeText("3"))
        onView(withId(R.id.btn_multiply)).perform(click())
        onView(withId(R.id.tv_result)).check(matches(withText("12")))
    }

    @Test
    fun divisionClickTest() {
        onView(withId(R.id.et_num1)).perform(typeText("10"))
        onView(withId(R.id.et_num2)).perform(typeText("2"))
        onView(withId(R.id.btn_division)).perform(click())
        onView(withId(R.id.tv_result)).check(matches(withText("5")))
    }
}