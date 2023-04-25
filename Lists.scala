package Demo

object Lists {

  //lists are immutable in scala and array is mutable
 val mylist : List[Int] = List(1,2,3,4,7,8,5);
  val names : List[String] = List("max", "tom", "John");

  println(0 :: mylist);
  println(mylist);
  println(names);
  println(1 :: 5 :: 9 :: Nil);
  println(mylist.head);
  println(mylist.tail);
  println(names.isEmpty);
  println(mylist.reverse);
}
