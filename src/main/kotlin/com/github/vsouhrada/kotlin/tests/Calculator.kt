package com.github.vsouhrada.kotlin.tests

/**
 * @author vsouhrada
 */
open class Calculator {
  fun add(x: Int, y: Int) = x + y

  fun subtract(x: Int, y: Int) = x - y

  fun divide(x: Int, y: Int): Int {
    if (y == 0) {
      throw IllegalArgumentException()
    }
    return x / y
  }
}

class AdvancedCalculator : Calculator() {

  fun pow(base: Int, exponent: Int) = Math.pow(base.toDouble(), exponent.toDouble()).toInt()

}