package com.vsouhrada.kotlin.playground.default_value

import java.util.*

/**
 * @author vsouhrada
 */
data class UserInKotlin(val uuid: String = UUID.randomUUID().toString(),
                        val name: String,
                        val hasAccess: Boolean = true,
                        val isAdmin: Boolean = false,
                        val notes: String = "") {
}


// Show how to call
// Show Named Arguments