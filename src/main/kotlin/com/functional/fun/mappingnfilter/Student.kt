package com.functional.`fun`.mappingnfilter

data class Student(
    val name: String,
    val surname: String,
    val degree: Degree,
    val modules: List<DegreeModule>
)

data class Degree(
    val name: String
)

data class DegreeModule(
    val name: String
)
