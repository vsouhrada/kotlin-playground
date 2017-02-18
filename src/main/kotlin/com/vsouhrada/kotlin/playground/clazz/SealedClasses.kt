package com.vsouhrada.kotlin.playground.clazz

import com.vsouhrada.kotlin.playground.clazz.Pet.Cat
import com.vsouhrada.kotlin.playground.clazz.Pet.Dog

/**
 * @author vsouhrada
 */

sealed class Pet(val name: String) {

  class Dog(name: String) : Pet(name)

  class Cat(name: String) : Pet(name)

}

fun Pet.saySomething(): String {
  return when (this) {
    is Pet.Dog -> "woof"
    is Pet.Cat -> "meow"
  }

}

fun main(args: Array<String>) {
  val dog = Pet.Dog("Tobik")
  val cat = Pet.Cat("Murf")

  println("Say ${if (cat.name.equals("a")) "a" else "b" } something ..... ${dog.saySomething()}")
  println("Say ${cat.name} something ..... ${cat.saySomething()}")
}