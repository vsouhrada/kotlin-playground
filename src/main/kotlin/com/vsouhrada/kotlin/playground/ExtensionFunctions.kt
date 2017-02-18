package com.vsouhrada.kotlin.playground

/**
 * @author vsouhrada
 */

fun String.and(input: String): String {
  return "${this} $input"
}


fun String.capitalize(): String {
  return this.toUpperCase()
}

fun String.hello() {
  println("Hello, $this!")
}


fun main(args: Array<String>) {
  var testString = "This is a string".and("This is another")

  println(testString)

  "Vaclav".hello() // prints 'Hello, GK!'

  println("vaclav souhrada".capitalize())
}