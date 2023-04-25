package Demo

object Map_and_Filter {
///map method
  val list = List(1,2,3,6,8,4,12);
  val mymap = Map(1 -> "Tom", 2 -> "Max", 3->"John");

  def main(args: Array[String]): Unit = {
    println(list.map(x=> x+2));
    println(list.map(x=> "Hi"* x));

    println(mymap.map(x=> "hii" + x));
   // println(mymap.mapValues(x => "hii " + x));

    println("Hello".map(_.toUpper));

    //flatten method in collections
    println(List(List(1,2,3),List(3,4,5)));
    println(List(List(1,2,3),List(3,4,5)).flatten);

    //flatmap method
    println(list.map(x => List(x, x+1)));
    println(list.flatMap(x => List(x, x+1)));

    //filter method
    println((list.filter(x => x%2==0)));
    println((list.filter(x => x%2!=0)));
  }
}
