package com.github.vsouhrada.kotlin.clazz

import com.github.vsouhrada.kotlin.clazz.Pet.Cat
import com.github.vsouhrada.kotlin.clazz.Pet.Dog

/**
 * @author vsouhrada
 */

sealed class Pet(val name: String) {

  class Dog(name: String) : Pet(name)

  class Cat(name: String) : Pet(name)

}

fun Pet.saySomething(): String {
  return when (this) {
    is Dog -> "woof"
    is Cat -> "meow"
  }

}

fun main(args: Array<String>) {
  val dog = Dog("Tobik")
  val cat = Cat("Murf")

  println("Say ${if (cat.name.equals("a")) "a" else "b" } something ..... ${dog.saySomething()}")
  println("Say ${cat.name} something ..... ${cat.saySomething()}")
}