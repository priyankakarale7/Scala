package Demo
import Array._;
object Arrays {
  val myarray : Array[Int] = new Array[Int](4);
  val myarray2 = new Array[Int](5);
  val myarray3 = Array(1,2,3,4,5,6);


  def main(args: Array[String]): Unit = {
    myarray(0) = 20;
    myarray(1) = 14;
    myarray(2) = 30;
    myarray(3) = 25;

    //println( myarray); -> print address only
    for(x <- myarray){
      println(x);
    }

    println(myarray3.length);
    val result = concat(myarray,myarray3);
    for(i <- 0 to myarray.length-1){
      println(myarray(i));
    }
  }
}
