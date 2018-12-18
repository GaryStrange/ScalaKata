import StringProcessing.DistinctLetters
import org.specs2.mutable.Specification

class DistinctLettersTest extends Specification {
  "DistinctLetters(hello world)" should {
    "return (helo world)" in {
      DistinctLetters.OnlyDistinct("hello world") must_=== "helo world"
    }
  }
}
