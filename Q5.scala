object Question_05{
    def main(args: Array[String]): Unit = {
          println("Enter number=")
          val n: Int = scala.io.StdIn.readInt()
          println(sumEven(n))
    }

    def sumEven(n:Int):Int={
    if (n <= 0){
        return 0
    }else if (n % 2 == 0){
        return (n-2) + sumEven(n - 2)
    }else{
        return sumEven(n - 1)
    }
  }

}