package ru.job4j.base

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

internal class ComparisonKtTest: StringSpec ({
    "max from 17 and 19 is 19" {
        max(17,19) shouldBe 19
    }

    "max from 25, 28 and 32 is 32" {
        maxOf3Num(25, 28, 32) shouldBe 32
    }
})