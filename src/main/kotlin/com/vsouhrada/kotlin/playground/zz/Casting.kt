package com.vsouhrada.kotlin.playground.zz

/**
 * @author vsouhrada
 */

open class Employee {
  var a: String? = null
}


class Developer(val vacationDays: Int): Employee() {

  fun hasVacation() : Boolean {
    return vacationDays > 0
  }

  fun takeTimeOff() {

  }
  
}

class CEO() : Employee() {

}

fun validateVacations(employee: Employee) {
  if (employee is Developer) {
    if (employee.vacationDays < 20) {
      println("You should take some more time off!!!")
    }
  }

}


// 1) show adding variable
// 2) add hasVacation() method and call it inside IF + takeTimeOff method - same goes for disjunction




fun whenExpression(employee: Employee) {
  val hasVacation = when(employee) {
    is Developer -> employee.hasVacation()
    else -> false

  }
}




