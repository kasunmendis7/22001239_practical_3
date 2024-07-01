// 1. Write a function in Scala that takes a string as input and returns the reverse of the string using a recursive approach.

object Question1{
    def main(args: Array[String]): Unit={
        print("Enter an expression : ")
        val inputString = scala.io.StdIn.readLine()
        val reversedString = reverseString(inputString)
        println("Reversed String: "+ reversedString)
    }

    def reverseString(word: String):String={
        if(word.isEmpty){
            ""
        }else{
            reverseString(word.tail)+word.head
        }
    }
}