package ru.job4j.base

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

internal class CalcKtTest : StringSpec({
    "5 + 7 = 12" {
        add(5, 7) shouldBe 12
    }

    "72 - 18 = 0" {
        subtract(72, 18) shouldBe 54
    }

    "8 * 5" {
        multiply(8, 5) shouldBe 40
    }

    "30 / 7.5" {
        division(30.0, 7.5) shouldBe 4.0
    }
})
