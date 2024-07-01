object Question4 {
  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5, 6)
    println(s"The sum of even numbers is: ${sumEvenNumbers(numbers)}")
  }

  def sumEvenNumbers(nums: List[Int]): Int = {
    nums.filter(_ % 2 == 0).sum
  }
}
