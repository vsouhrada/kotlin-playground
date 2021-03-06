package com.vsouhrada.kotlin.playground.special_cases

/**
 * @author vsouhrada
 */

data class Money(var currencyCode: String, var amount: Int)

 operator fun Money.plus(other: Money): Money {
  if (currencyCode != other.currencyCode) {
    throw IllegalArgumentException("Currency code ${other.currencyCode}  does not match ${currencyCode}.")
  }

  return copy(amount = amount + other.amount)
}

fun main(args: Array<String>) {
  val one = Money("USD", 100)
  val two = Money("USD", 200)
  val three = one + two
  
  println(one)
  println(two)
  println(three)

  // There is more!!!!!
  // uncomment + add operator - change to plus
  //val three2 = one + two
  // println(three2)
}