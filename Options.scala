package Demo

object Options {
  // Options Some or None
  val list = List(1,2,3);
  val map = Map(1 -> "Tom", 2 -> "Max", 3->"John");
  val opt : Option[Int] = Some(45);

  def main(args: Array[String]): Unit = {
    println(list.find(_ > 6));
    println(list.find(_ > 1));

    println(list.find(_ > 2).get);
    println(list.find(_ > 1).get);
    println(map.get(2));

    println(list.find(_ > 6).getOrElse(0));
    println(map.get(7).getOrElse("No name Found"));

    println(opt.isEmpty);
  }
}
