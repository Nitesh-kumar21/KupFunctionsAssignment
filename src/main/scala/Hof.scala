class Hof {

  val higherOrderFunction: Function2[Function1[Int, Int], Int, Int] = new Function2[Function1[Int, Int], Int, Int] {
    override def apply(num1: Int => Int, num2: Int): Int = num1(num2)
  }
}
