package Demo
//Collection of key value pair
object Maps {

  /*101 max
    102 tom
    103 july
    104 jerry
    105 nobita
   */

  //by default map is immutable
  //maps key can't be duplicated

  val mymap : Map[Int , String] =
    Map(101 -> "max", 102 -> "tom", 103 -> "july", 104 -> "jerry");


  val mymap2 : Map[Int , String] =
    Map(107 -> "harry",106 -> "jurry");

  def main(args: Array[String]): Unit = {
    println(mymap);
    println(mymap(103));
    println(mymap.keys);
    println(mymap.values);
    println(mymap.isEmpty);

    mymap.keys.foreach{
      key => println("key " + key);
        println("Value "  + mymap(key));
    }

    println(mymap.contains(10232));

    println(mymap++mymap2);

  }
}
