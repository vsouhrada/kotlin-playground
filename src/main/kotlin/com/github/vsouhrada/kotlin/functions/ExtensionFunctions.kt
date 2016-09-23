package com.gk_software.futurelab.kotlin_demo.functions

/**
 * @author vsouhrada
 */

fun String.and(input: String): String {
  return "${this} ${input}"
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

  "GK".hello() // prints 'Hello, GK!'

  println("gk software".capitalize())
}