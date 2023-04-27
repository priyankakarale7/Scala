package Demo

import scala.jdk.CollectionConverters._

object Practice_Questions {


  //Question

  val lst1 = List("tejas", "dipak", "karan", "dipak","dipak");
  val lst2 = List("karan", "dipak", "dipak", "tejas");

  //Question 1
  //compare with frequency
  def checkFreq : Boolean = {

    var counts = new scala.collection.mutable.HashMap[String,Int];
    for (i <- lst1) {
      if (counts.contains(i))
        counts.put(i, counts(i) + 1)
      else
        counts.put(i, 1)
    }

    var counts2 = new scala.collection.mutable.HashMap[String,Int];
    for (i <- lst2) {
      if (counts2.contains(i))
        counts2.put(i, counts(i) + 1)
      else
        counts2.put(i, 1)
    }

    counts.keys.foreach{
      key => if(counts(key) != counts2(key)) return false;
    }
    counts2.keys.foreach{
      key => if(counts(key) != counts2(key)) return false;
    }

    return true;
  }

//Question 2
  // checking the names in list without checking frequency

  def toSet(list :List[String]): scala.collection.immutable.Set[String] = {
    var newSet = Set.empty[String];
    for(i <- list){
      newSet += i;
    }
    return newSet;
  }

  def checkList : Boolean = {

    var set1 = toSet(lst1);
    var set2 = toSet(lst2);
    //println(set1);


    for(i <- set1){
      if(!set2.contains(i)) return false;
    }
    for(i <- set2){
      if(!set1.contains(i)) return false;
    }



    return true;
  }

//Question 3
  var list1 : List[String] = List("a","b","c","d");
  var list2 : List[String] = List("a","b","f","g");

  var lstSet = toSet(list1);
  var lstSet2 = list2.toSet;

  var anslst = list1.filterNot(lstSet2); // list1-list2
  var anslst2 = list2.filterNot(lstSet); //list2- list1


def main(args: Array[String]): Unit = {
    println(checkFreq);
    println(checkList);

  println(lstSet);
  println(lstSet2)
  println(anslst);
  println(anslst2);
  }
}
