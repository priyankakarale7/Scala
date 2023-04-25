package Demo

object Tuples {
  //immutable
  //it contains hetrogeneous datatypes

  //at max we store 22 elements in tuple

  val mytuple = (1,2, "hello", true);
  val mytuple2 = new Tuple3(1,2, "hello");
  val mytuple3 = new Tuple4(1,2, "hello",( 4, true));

  def main(args: Array[String]): Unit = {
    println(mytuple);
    println(mytuple._3);
    println(mytuple._1);
    println(mytuple._2);
    println(mytuple3._4);

    mytuple.productIterator.foreach(i => println(i));

    println(1 -> "Tom" -> true);

    println(mytuple3._4._2);
  }
}
