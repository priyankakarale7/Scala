package Demo;
import java.util.Date;

object Functions {
  //Functions in Scala
  object Math{
    def +(x : Int, y : Int) : Int = {
      x+y;
    }
    def **(x: Int) = x*x;

    def print(x: Int, y: Int) : Unit = {
      println(x+y);
    }
  }

  //Higher Order functions - which are able to take function as an argument and return function
  def math(x: Double, y: Double, f: (Double, Double)=>Double): Double = f(x,y);

  def maths(x: Double, y: Double, z: Double, f: (Double, Double)=>Double): Double = f(f(x,y),z);


  def log(date : Date , message : String) = {
    println(date +"    "+message);
  }


  // Closures - It is functions which uses one or more variables declared outside this functions

  val add1 = (x: Int) => x+10;


  /* Currying - is the technique of transforming a function that takes multiple
                 arguments into a function that takes a single argument*/


  def main(args : Array[String]){

    //Anonymous function
    var add = (x : Int , y : Int ) => x+y;
      //println(add(5,7));

//    println("Hello");
//    println(Math.**(4));
//    Math.print(3,2);

    val result = maths(50,20,30,(x,y) => x+y);
    println(result);

    val result1 = maths(50,20,30,_+_); // underscore is wildcart character
    println(result1);

    val res = math(50,20,(x,y) => x*y);
    println(res);

    val res2 = math(50,20,(x,y) => x max y);
    println(res2);

    val res3 = math(50,20,(x,y) => x min y);
    println(res3);


    // Partially applied Functions - some arguments are fixed and some we have to assign
    val sum = (a : Int,b: Int,c: Int) => a+b+c;
    val f = sum(30,20,_: Int)
    println(f(10));

    val date = new Date;
    val newLog = log(date,_: String);
    newLog("Message 1");
    newLog("Message 2");

    println(add1(30));



  }
}
