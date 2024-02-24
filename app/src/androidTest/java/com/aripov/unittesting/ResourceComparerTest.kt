package com.aripov.unittesting

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class ResourceComparerTest {
    private lateinit var resourceComparer: ResourceComparer
    @Before
    fun setup() {
        resourceComparer = ResourceComparer()
    }
    @After
    fun tearDown() {
        //would need to kill off the processes that are not terminated by the garbage collector.
    }
    @Test
    fun stringResourceIsTheSameAsGivenString_returnsTrue() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context, R.string.app_name, "UnitTesting")
        assertThat(result).isTrue()
    }
    @Test
    fun stringResourceIsTheDifferentAsGivenString_returnsFalse() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context, R.string.app_name, "Not the same!")
        assertThat(result).isFalse()
    }
}