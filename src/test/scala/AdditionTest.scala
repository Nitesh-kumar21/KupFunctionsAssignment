import org.scalatest.flatspec.AnyFlatSpec

class AdditionTest extends AnyFlatSpec {
  val obj = new Addition
  val a =5
  val b=7
  "condition" should "give the addition of the given number" in {
    val result =a+b
    assert(obj.add(a,b) == result)
  }


}
