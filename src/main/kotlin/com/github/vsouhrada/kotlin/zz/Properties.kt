package com.github.vsouhrada.kotlin.zz

/**
 * @author vsouhrada
 */


class MyPropertiesClassInKotlin {

  var price: Int = 0

  val hasItemPrice: Boolean
    get() = this.price > 0

}

class A {

  companion object {
  }

  var price: Int = 0

  val hasItemPrice: Boolean
    get() = this.price > 0

}