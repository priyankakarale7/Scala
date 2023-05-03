package Demo

class Expression {

  /*
  write a code to solve a expression given as a string:

example:

string = "(5-8+3*9)+4-9+9"

solve it and display the answer

expression can hold = +-/%*()0-9
   */

  import scala.collection.mutable.Stack

  def evaluate(expression: String): Double = {
    val operators = Stack[Char]()
    val operands = Stack[Double]()

    var i = 0
    while (i < expression.length) {
      val c = expression(i)
      if (c.isDigit) {
        var num = c.toString.toDouble
        while (i + 1 < expression.length && expression(i + 1).isDigit) {
          num = num * 10 + expression(i + 1).toString.toDouble
          i += 1
        }
        operands.push(num)
      } else if (c == '(') {
        operators.push(c)
      } else if (c == ')') {
        while (operators.top != '(') {
          operands.push(applyOperator(operators.pop(), operands.pop(), operands.pop()))
        }
        operators.pop()
      } else if (isOperator(c)) {
        while (operators.nonEmpty && hasPrecedence(c, operators.top)) {
          operands.push(applyOperator(operators.pop(), operands.pop(), operands.pop()))
        }
        operators.push(c)
      }
      i += 1
    }

    while (operators.nonEmpty) {
      operands.push(applyOperator(operators.pop(), operands.pop(), operands.pop()))
    }

    operands.top
  }

  def isOperator(c: Char): Boolean = {
    c == '+' || c == '-' || c == '*' || c == '/' || c == '%'
  }

  def hasPrecedence(op1: Char, op2: Char): Boolean = {
    if (op2 == '(' || op2 == ')') {
      false
    } else if ((op1 == '*' || op1 == '/' || op1 == '%') && (op2 == '+' || op2 == '-')) {
      false
    } else {
      true
    }
  }

  def applyOperator(operator: Char, b: Double, a: Double): Double = {
    operator match {
      case '+' => a + b
      case '-' => a - b
      case '*' => a * b
      case '/' => a / b
      case '%' => a % b
    }
  }


}

object Expression extends App{
  val exp = new Expression;
  val expression = "(5-8+3*9)+4-9+9"
  val result = exp.evaluate(expression)
  println(result)

}