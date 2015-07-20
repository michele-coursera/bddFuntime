import org.scalatest._

class RomanNumberSpec extends FlatSpec with Matchers {

  "Roman numbers" should "Convert 1 to I" in {
    RomanNumbers.toString(1) should be("I")
  }
}

