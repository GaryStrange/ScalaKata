import ArrayProcessing.SortByLength
import org.specs2.mutable.Specification

class SortByLengthTest extends Specification {
  "SortByLength" should {
    "return (aaa)" in {
      SortByLength.LengthSort(Array("apple", "pear", "banana")) must_=== Array("pear", "apple", "banana")
    }
  }
}