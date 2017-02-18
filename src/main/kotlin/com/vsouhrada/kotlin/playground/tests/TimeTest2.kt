package com.vsouhrada.kotlin.playground.tests

import com.vsouhrada.kotlin.playground.tests.at
import com.vsouhrada.kotlin.playground.tests.firstSecond
import com.vsouhrada.kotlin.playground.tests.lastSecond
import java.sql.Date
import java.time.*
import java.time.temporal.ChronoUnit

/**
 * @author vsouhrada
 */


fun main(args: Array<String>) {


  val sqlDate = Date(Clock.systemDefaultZone().millis())
  println("Sql Date: $sqlDate")

  println("Sql Date - toLocalDateTime ${sqlDate.toLocalDateTime()}")

 // var day = sqlDate.toLocalDateTime()
  var day = LocalDateTime.now()
  var beginDateTime = day at firstSecond
  var endDateTime = day at lastSecond

  println("day: $day")
  println("beginDate: $beginDateTime")
  println("endDateTime: $endDateTime")
}


fun Date.toLocalDateTime() = Instant.ofEpochMilli(this.time).atZone(ZoneId.systemDefault()).toLocalDateTime()