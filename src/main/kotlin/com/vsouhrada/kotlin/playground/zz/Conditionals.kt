package com.vsouhrada.kotlin.playground.zz

/**
 * @author vsouhrada
 */

fun ifAsExpression(parameter: Int) {
  val result = if (parameter > 20) 30 else 20
}

fun ifAsExpression2(parameter: Int) {
  var result = if (parameter > 100) {
    val b = 30 + parameter
    b
  } else {
    20
  }
}
