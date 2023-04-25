package Demo

object Sets {

  //by default it is immutable
  // to make them mutable scala.collection.mutable.Set

  //sets are not ordered and not contain duplicates

  val myset : Set[Int] = Set(1,2,3,4,6,4,6,3,6,9);
  val myset2 : Set[Int] = Set(9,6,4,6,3,6,9,87,65,43,24,54,0);
  val names :Set[String] = Set("Max", "Tom", "Jerry");

  def main(args: Array[String]): Unit = {
    println(myset + 20);
    println(names("Maxxx"));
    println(myset.head);
    println(myset.tail);
    println(myset.isEmpty)
    println(myset ++ myset2);
    println(myset.++(myset2));

    println(myset.&(myset2));
    println(myset.intersect(myset2));
    println(myset.max);

    println(myset.min);

    myset.foreach(println);

    for(name <- names){
      println(name);
    }



  }

}
