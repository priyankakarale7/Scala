package Demo
import java.time.LocalDate
import scala.io.Source

//Question
/*
1. Read Employee from csv file with 4 column {empId, empName, empSal, empDob, empDoj}

2. Remove the duplicate records

3. Sort it based on empDoj

4. Iterate and print the data


1)Read the file

2)display distinct records

3)sorted records using DOJ and DOB

4) highest , lowest, avg salary

5) employee above avg and below avg salary
 */



case class Employee(empId: Int, empName: String, empSal: Double, empDob: LocalDate, empDoj: LocalDate)

  object Employee{


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
    def printAllEmp{
      val uniqueEmployees = employees.groupBy(_.empId).map(_._2.head).toList

      // sort employees based on empDoj
      val sortedEmployees = uniqueEmployees.sortBy(emp => (emp.empDoj, emp.empDob))

      // print employee data
      sortedEmployees.foreach(e => println(s"${e.empId}, ${e.empName}, ${e.empSal}, ${e.empDob}, ${e.empDoj}"))
    }
    def highestSalEmp{ // find the employee with the highest salary
      val highestSalaryEmployee = employees.maxBy(_.empSal)

      // print employee data
      println(s"${highestSalaryEmployee.empId}, ${highestSalaryEmployee.empName}, ${highestSalaryEmployee.empSal}, ${highestSalaryEmployee.empDob}, ${highestSalaryEmployee.empDoj}")
    }


    def lowestSalEmp{ // find the employee with the highest salary
      val lowestSalaryEmployee = employees.minBy(_.empSal)

      // print employee data
      println(s"${lowestSalaryEmployee.empId}, ${lowestSalaryEmployee.empName}, ${lowestSalaryEmployee.empSal}, ${lowestSalaryEmployee.empDob}, ${lowestSalaryEmployee.empDoj}")
    }

    val sal_sum = employees.map(_.empSal).sum
    val total_emp = employees.size.toDouble
    val avg_sal = sal_sum / total_emp


    def above_avg {
      //employee above average salary

      println(("Average salary of employees is " + avg_sal))
      val above_avg_Employees = employees.filter(e => e.empSal > avg_sal);

      above_avg_Employees.foreach(e => println(s"${e.empId}, ${e.empName}, ${e.empSal}, ${e.empDob}, ${e.empDoj}"))
    }
    //below avg emp
    def below_avg{
      val below_avg_Employees = employees.filter(e => e.empSal < avg_sal);

      below_avg_Employees.foreach(e => println(s"${e.empId}, ${e.empName}, ${e.empSal}, ${e.empDob}, ${e.empDoj}"))
    }


    def main(args: Array[String]): Unit = {
      //printAllEmp
      highestSalEmp
      lowestSalEmp
      above_avg
      println()
      below_avg
    }
  }
