import StringProcessing.ValidPin
import org.specs2.mutable.Specification

class ValidPinTest extends Specification {
  "ValidPin" should {
    "return false if wrong length" in {
      ValidPin.Validate("12345") must_=== false
    }
    "return false if any non-digits" in {
      ValidPin.Validate("!234") must_=== false
    }
    "return false if input null" in {
      ValidPin.Validate(null) must_=== false
    }
    "return true on valid input" in {
      ValidPin.Validate("1234") must_=== true
    }
  }
}
