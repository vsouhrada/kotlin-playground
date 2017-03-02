package com.vsouhrada.kotlin.playground.zz

import com.google.gson.Gson

/**
 * @author vsouhrada
 */

class Customer(val id: Int, val name: String, val email: String)




fun main(args: Array<String>) {
  val customer1 = Customer(1, "Vaclav Souhrada", "vsouhrada@somewhere.com")
  val customer2 = Customer(1, "Vaclav Souhrada", "vsouhrada@somewhere.com")
  val customer3 = customer1

  println(customer1)                    // toString()
  println(customer1.hashCode())         // hashCode()
  println(customer1.equals(customer2))  // equals()
  println(customer1.equals(customer3))

  val customer = Customer(id = 2001, name = "Vaclav Souhrada", email = "vsouhrada@email.com")

  val json = customer.toJSON()

  val updatedCstSouhrada = customer.copy(email = "vaclav_souhrada@email.com")
}


data class Item(var name: String, var bsngp: BusinessUnitGroup)

// ...
fun Any.toJSON(): String {
  return Gson().toJson(this)
}


data class BusinessUnitGroup(var name: String)




// Destructuring declarations
//fun main(args: Array<String>) {
//  val item = Item("AAA", BusinessUnitGroup("GK"))
//  val (name, bsngp) = item
//
//  println("Item $name with BSNGP = $bsngp")
//}