/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package com.bradcypert.mox

import kotlin.test.Test
import kotlin.test.assertTrue

class MoxTest {
    @Test fun testSomeLibraryMethod() {
        val classUnderTest = Mox()
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'")
    }
}