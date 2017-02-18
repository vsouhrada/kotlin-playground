package com.gk_software.futurelab.kotlin_demo.nulls

import com.vsouhrada.kotlin.playground.beans.PersonInKotlin

/**
 * @author vsouhrada
 */
class UserServiceInKotlin {

  fun validateFulabMember(person: PersonInKotlin) {
    if (person.firstName.startsWith(" ")) {
      throw IllegalStateException("First Name is not allowed to beginning with empty string")
    }
    if (person.lastName.startsWith(" ")) {
      throw IllegalStateException("Last Name is not allowed to beginning with empty string")
    }
    if (!person.email.contains("@gmail.com")) {
      throw IllegalStateException("Only GMAIL domains are allowed!!!")
    }
  }

}
