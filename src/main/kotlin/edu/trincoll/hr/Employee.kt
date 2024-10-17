package edu.trincoll.hr

// Abstract class Employee should have:
//   - a name of type String
//   - an id of type Int.

// It should implement the Comparable interface with the
// compareTo method.

//
// It should include an abstract method pay()
// that returns a Double.

//
// It should override the toString method to
// return a string with the name and id of the employee.
abstract class Employee(val name:String, val id:Int
):Comparable<Employee> {

   abstract fun pay(): Double

    override fun toString(): String {
        return "Name: $name, ID: $id"
    }

    override fun compareTo(other: Employee): Int {
        return compareValuesBy(this, other, Employee::pay, Employee::name, Employee::id)
    }
}