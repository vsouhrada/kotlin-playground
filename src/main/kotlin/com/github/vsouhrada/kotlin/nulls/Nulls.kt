package com.github.vsouhrada.kotlin.nulls

import java.io.File

/**
 * @author vsouhrada
 */

fun main(args: Array<String>) {
  // Types are not nullable by default
  var name: String

  // uncomment
  //name = null








  // Types can be nullable
  var email: String?

  email = null







  // Interop with nullable types
  val files = File("Test").listFiles()

  // Longer version
  if (files != null) {
    println(files.size)
  }

  // shorter versions
  println(files?.size)

  println(files?.size ?: "File is empty")



  // looking for trouble - uncomment
  //println(files!!.size)
}