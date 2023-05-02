package Demo
import java.time.LocalDate
import scala.io.Source

Question
/*
1. Read Employee from csv file with 4 column {empId, empName, empSal, empDob, empDoj}

2. Remove the duplicate records

3. Sort it based on empDoj

4. Iterate and print the data
 */


case class Employee(empId: Int, empName: String, empSal: Double, empDob: LocalDate, empDoj: LocalDate)

  object Employee extends App{


val source = Source.fromFile("/Users/a614734/Downloads/employees1.csv")
val lines = source.getLines().toList
source.close()

val header = lines.head // extract header row
val data = lines.tail.map(_.split(',')) // extract data rows

// create a list of Employee objects from the data rows
val employees = data.map(row => Employee(
row(0).toInt,
row(1),
row(2).toDouble,
LocalDate.parse(row(3)),
LocalDate.parse(row(4))
))

// remove duplicate records based on empId
val uniqueEmployees = employees.groupBy(_.empId).map(_._2.head).toList

// sort employees based on empDoj
val sortedEmployees = uniqueEmployees.sortBy(_.empDoj)

// print employee data
sortedEmployees.foreach(e => println(s"${e.empId}, ${e.empName}, ${e.empSal}, ${e.empDob}, ${e.empDoj}"))

  }