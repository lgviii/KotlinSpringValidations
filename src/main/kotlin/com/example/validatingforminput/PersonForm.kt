package com.example.validatingforminput

import javax.validation.constraints.Min
import javax.validation.constraints.Size

data class PersonForm(
    @field:Size(min = 10, max = 30)
    val name: String? = null,
    @field:Min(18)
    val age: Int? = null
) {
    override fun toString(): String {
        return "Person(Name: $name, Age: $age)"
    }
}