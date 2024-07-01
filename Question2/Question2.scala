/* Write a function in Scala that takes a list of strings as input and returns a new list
containing only the strings that have a length greater than 5. */
object Question2 {
  def main(args: Array[String]): Unit = {
    var j = 0
    val inputList = List("apple", "banana", "grape", "car", "van", "orange")
    var filteredList = List.empty[String] 

    for (i <- 0 until inputList.length) {
      if (inputList(i).length > 5) {
        filteredList = filteredList :+ inputList(i) 
      }
    }

    println("Filtered List: " + filteredList.mkString(", ")) 
  }
}
