package com.chaozhang.lib

import com.chaozhang.lib.databinding.LibBinding
import org.junit.Assert.assertNotNull
import org.junit.Test
import org.mockito.Mockito.mock

class ExampleUnitTest {

    @Test
    fun testDataBinding() {
        val libBinding = mock(LibBinding::class.java)
        assertNotNull(libBinding)
    }
}