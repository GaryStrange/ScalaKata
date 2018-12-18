package Calculators
import org.specs2.mutable.Specification

class CubeCalculatorSpec2Test extends Specification {
  "CubeCalculator" should {
    "positive number to the power of three" in {
      CubeCalculator.cube(3) must_=== 27
    }
    "negative number to the power of three" in {
      CubeCalculator.cube(-1) must_=== -1
    }
    "zero to the power of three" in {
      CubeCalculator.cube(0) must_=== 0
    }
  }
}
