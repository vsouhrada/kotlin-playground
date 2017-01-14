package com.github.vsouhrada.kotlin.tests

import com.github.vsouhrada.kotlin.tests.toLocalDateTime
import java.sql.Date
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.Period
import java.time.temporal.ChronoUnit
import kotlin.reflect.KClass

/**
 * @author vsouhrada
 */

object months
object firstSecond
object lastSecond

fun main(args: Array<String>) {
//  val startDate = LocalDateTime.of(2015, 8, 30, 14, 0, 0)
//  val endDate = LocalDateTime.now()
//
//  //val period = ChronoUnit.MONTHS.between(startDate.toLocalDate(), endDate.toLocalDate())
//  val period = endDate at firstSecond
//
//  println(startDate)
//  println(endDate)
//  println(period)

  val date = Date.valueOf(LocalDate.now())

  val dateAsLocalDateTime = date.toLocalDateTime()

  val startTime = dateAsLocalDateTime at firstSecond
  val endTime = dateAsLocalDateTime at lastSecond

  println("Date: $date")
  println("Date as LocalDateTime: $dateAsLocalDateTime")
  println("startTime: $startTime")
  println("endTime: $endTime")



}

infix fun LocalDate.months(endDate: LocalDate) = ChronoUnit.MONTHS.between(this, endDate)
infix fun LocalDateTime.months(endDate: LocalDateTime) = ChronoUnit.MONTHS.between(this, endDate)

infix fun LocalDateTime.at(firstSecond: firstSecond) = LocalDateTime.of(this.toLocalDate(), LocalTime.MIN)
infix fun LocalDateTime.at(lastSecond: lastSecond) = LocalDateTime.of(this.toLocalDate(), LocalTime.MAX)

infix fun LocalDate.at(firstSecond: firstSecond) = LocalDateTime.of(this, LocalTime.MIN)
infix fun LocalDate.at(lastSecond: lastSecond) = LocalDateTime.of(this, LocalTime.MIN)

interface Join<E> {
  infix fun join(type: KClass<Any>) = print("aa")
}
