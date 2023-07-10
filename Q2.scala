import scala.compiletime.ops.boolean
object Question_01{
    def main(args: Array[String]): Unit = {
        print("Enter Number= ")
         val n: Int = scala.io.StdIn.readInt()
         primeSeq(n)
    }
    def is_prime(num:Int, divisor:Int=2): Boolean={
        if (num < 2)
          return false
        if (num == divisor)
          return true
        if (num % divisor == 0)
          return false
        return is_prime(num, divisor + 1)
        }

    def primeSeq(n:Int, current:Int=2):Unit= {
        if (current < n){
          if (is_prime(current))
            println(current)
          primeSeq(n, current + 1)
        
       }
}
}