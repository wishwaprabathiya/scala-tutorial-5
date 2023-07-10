object Question_04{
    def main(args: Array[String]): Unit = {
       println("Enter number=")
       val n: Int = scala.io.StdIn.readInt()
       println(isEven(n))
    }

    def isEven(n:Int):Boolean ={
       if(n==0) {
         true
       } else if(n==1){ 
        false
       } else if(n<0) {
        isEven(-n)
       } else {
        isEven(n-2)
       }
    }
}