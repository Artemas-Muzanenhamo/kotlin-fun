package com.functional.`fun`.mappingnfilter

class MapExample {

    fun getAllComputerScienceStudents(students: List<Student>): List<Student> {
        return students
            .filter { student -> student.degree.name == "computer science" }
    }

    fun getAllCSStudentsFirstNames(students: List<Student>): List<String> {
        return students
            .filter { student -> student.degree.name == "computer science" }
            .map { student -> student.name }
    }

    fun getModulesByName(students: List<Student>, studentName: String): List<DegreeModule> {
        return students
            .filter { student -> student.name == studentName }
            .flatMap { student -> student.modules }

        // <List<List<something>> <-- apply flatMap
        // <List<something> <--- you get this

        // [ [1, 2] [1, 2] ] -> flatMap() + sum() -->  6
    }


}
