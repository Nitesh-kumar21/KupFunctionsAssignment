import org.scalatest.flatspec.AnyFlatSpec

class SumOfListTest extends AnyFlatSpec {
  val list = List(1,2,3,4,5,6,7,8,9)
  val listSum = new ListSum()

  "Sum of the list" should "be give the result " in{
    assert(listSum.sumOfList(list) ==list.sum)
  }
}
