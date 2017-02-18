package com.vsouhrada.kotlin.playground.clazz

import java.util.*

/**
 * @author vsouhrada
 */
class ConstructorExample(val uuid: String) {


  init {
    // Initialize stuff here
  }

  constructor(count: Int) : this("546hg-7584kljh-4343") {

  }

}

fun main(args: Array<String>) {
  ConstructorExample(10)
}

