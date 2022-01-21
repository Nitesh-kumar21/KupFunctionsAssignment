class Addition {
  val add: Function2[Int, Int, Int] = new Function2[Int, Int, Int] {
    override def apply(firstNumber: Int, secondNumber: Int): Int = firstNumber + secondNumber
  }
  add.apply(10, 12)
}

