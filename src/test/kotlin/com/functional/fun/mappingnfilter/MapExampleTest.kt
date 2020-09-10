package com.functional.`fun`.mappingnfilter

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MapExampleTest {

    private val mapExample: MapExample = MapExample()

    private val students = listOf(
        Student("arty", "prime", Degree("computer science"), listOf(DegreeModule("algorithms"), DegreeModule("databases"))),
        Student("brandon", "bills", Degree("maths"), listOf(DegreeModule("analysis"), DegreeModule("pure maths"))),
        Student("charlie", "sloth", Degree("computer science"), listOf(DegreeModule("business and analysis"), DegreeModule("games"))),
        Student("marko", "darko", Degree("computer science"), listOf(DegreeModule("operating systems"), DegreeModule("software engineering"))),
        Student("naomi", "banks", Degree("business"), listOf(DegreeModule("profit and loss"), DegreeModule("marketing"))),
        Student("kanisha", "kk", Degree("french"), listOf(DegreeModule("history"), DegreeModule("literature")))
    )

    @Test
    fun `get all computer science students`() {
        val csStudent: List<Student> = mapExample.getAllComputerScienceStudents(students)

        assertThat(csStudent).isNotEmpty
        assertThat(csStudent)
            .hasSize(3)
            .containsExactlyElementsOf(
                listOf(
                    Student("arty", "prime", Degree("computer science"), listOf(DegreeModule("algorithms"), DegreeModule("databases"))),
                    Student("charlie", "sloth", Degree("computer science"), listOf(DegreeModule("business and analysis"), DegreeModule("games"))),
                    Student("marko", "darko", Degree("computer science"), listOf(DegreeModule("operating systems"), DegreeModule("software engineering")))
                )
            )
    }

    @Test
    fun `get all first names of all computer science students`() {
        val csStudentFirstNames: List<String> = mapExample.getAllCSStudentsFirstNames(students)

        assertThat(csStudentFirstNames)
            .isNotEmpty
            .hasSize(3)
            .hasSameElementsAs(listOf("arty", "charlie", "marko"))
    }

    @Test
    fun `get modules given a name`() {
        val modules: List<DegreeModule>  = mapExample.getModulesByName(students, "brandon")

        assertThat(modules)
            .isNotEmpty
            .hasSize(2)
            .hasSameElementsAs(listOf(DegreeModule("analysis"), DegreeModule("pure maths")))
    }
}
