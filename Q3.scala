object Question_01{
    def main(args: Array[String]): Unit = {
        print("Enter Number= ")
        val n: Int = scala.io.StdIn.readInt()
        println(sum(n))
    }

    def sum(n:Int ):Int={
        if(n==1) {
          return 1
        } 
        else {
          n + sum(n-1)
        }
    }
}

