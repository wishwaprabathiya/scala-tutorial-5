import scala.io.StdIn

object Question_06 {
  def main(args: Array[String]): Unit = {
    print("Enter Number: ")
    val n: Int = scala.io.StdIn.readInt()
    printFibo(n, 0)
  }

  def fib(i: Int): Int = {
    if (i <= 1)
       i
    else
      fib(i - 1) + fib(i - 2)
  }

  def printFibo(n: Int, i: Int): Unit = {
    if (n < 0){
      println("wrong input")
    }
    if (i < n) {
      println(fib(i))
      printFibo(n, i +1)
   }
  }
}