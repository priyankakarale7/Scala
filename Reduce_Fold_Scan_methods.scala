package Demo

import com.sun.tools.javac.Main

object Reduce_Fold_Scan_methods {
  //reduceLeft, reduceRight, foldLeft, foldRight, scanLeft, scanRight
  //used to apply binary operator of each element of collection

  val lst = List(1,2,3,5,7,10,13);
  val lst2 = List("A", "B", "C");

  def main(args: Array[String]): Unit = {
    println(lst.reduceLeft(_+_));
    println(lst2.reduceLeft(_+_));
    println(lst.reduceLeft((x,y) => {println(x+","+y);x+y; }));

    println(lst.reduceLeft(_-_));
    println(lst.reduceRight(_-_));

    println(lst2.reduceRight(_+_));
  }
}
