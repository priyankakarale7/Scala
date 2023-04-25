package Demo

object Strings {

  val num1 = 56;
  val num2 = 100.32;
  val str1 : String = "Hello World";
  val str2 : String = " Tom And Jerry";

  def main(args: Array[String]): Unit = {
    println(str1.length());
    println(str1.concat(str2));
    println(str1+str2);

    val result = printf("("+str2+")");
  }
}
