package com.github.vsouhrada.kotlin.tests

import java.time.LocalDateTime
import java.time.LocalTime
import java.time.temporal.IsoFields

/**
 * @author vsouhrada
 */

fun main(args: Array<String>) {
  val time = LocalDateTime.now()

  println(time.get(IsoFields.WEEK_OF_WEEK_BASED_YEAR))
}

fun multi(vararg values: Int) {}