package com.vsouhrada.kotlin.playground.zz

/**
 * @author vsouhrada
 */

fun main(args: Array<String>) {

  // In Kotlin, you don’t have to specify the type of each variable explicitly

  val list: Iterable<Double> = arrayListOf(1.0, 0.0, 3.1415, 2.718)  // Only need Iterable interface

  val arrayList = arrayListOf("Kotlin", "Scala", "Groovy")  // Type is ArrayList
}