package edu.trincoll.hr

// The HR class should have:
//   - a list of employees
//   - a hire method that takes an employee and returns a new HR object with that employee added
//   - a fire method that takes an id and returns a new HR object with the employee with that id removed
//   - a payEmployees method that returns the total pay of all employees
data class HR(private val employees: List<Employee> = emptyList()) {
    fun hire(employee: Employee):HR {
        return this.copy(employees = this.employees + employee)
    }

    fun fire(id:Int):HR {
        val notFired = employees.filterNot { it.id == id }
        return HR(notFired)
    }

    fun payEmployees():Double {
        return employees.sumOf { it.pay() }
    }

}