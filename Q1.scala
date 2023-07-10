object Question_01{
    def main(args: Array[String]): Unit = {
         print("Enter Number= ")
         val num: Int = scala.io.StdIn.readInt()
         println(prime_n_check(num))  
    }

    def prime_n_che(n: Int, i: Int = 2): Boolean = {
  if (n <= 2)
     return n == 2
  if (n % i == 0)
     return false
  if (i * i > n)
     return true
  prime_n_che(n, i + 1)
}
}