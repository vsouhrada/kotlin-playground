package com.vsouhrada.kotlin.playground.smart_cast

import com.vsouhrada.kotlin.playground.default_value.UserInKotlin

fun castDemo(obj: Any): String {
  if (obj !is UserInKotlin) {
    return "Uknown user"
  }

  return obj.name
}

