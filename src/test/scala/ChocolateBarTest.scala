import TreatBox.ChocolateBar
import org.specs2.mutable.Specification

class ChocolateBarTest extends Specification {
  "breakChocolate(5, 5)" should {
    "return 24" in {
      ChocolateBar.breakChocolate(5, 5) must_=== (24)
    }
  }
  "breakChocolate(4, 7)" should {
    "return 27" in {
      ChocolateBar.breakChocolate(5, 5) must_=== (27)
    }
  }
}
