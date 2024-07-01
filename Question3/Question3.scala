import scala.io.StdIn.readLine
object Question3{
    def main(args: Array[String]):Unit={
        print("Enter the number 1: ")
        val num1 = readLine().toDouble
        print("Enter the number 2: ")
        val num2 = readLine().toDouble
        val average = meanCalculator(num1, num2)
        println(f"Arithmetic mean: ${average}") 
}

    def meanCalculator(num1: Double, num2: Double):Double={
        val avg = (num1+num2)/2.0
        BigDecimal(avg).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
    }
}