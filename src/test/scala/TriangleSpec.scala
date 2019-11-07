import org.scalatest._
import org.sigurdthor.triangle.CalculatorLive

class TriangleSpec extends FeatureSpec with GivenWhenThen with Matchers {

  feature("Triangle calculator") {
    scenario("Calculate with two rows") {

      Given("Triangle ")

      val triangle = List(
        List(3),
        List(2, 1)
      )

      When(s"Node is calculated")

      val node = CalculatorLive.calculatePath(triangle)

      Then(s"Value should be 4")

      node.value should be
      4
    }

    scenario("Calculate with four rows") {

      Given("Triangle")

      val triangle = List(
        List(1),
        List(3, 2),
        List(4, 2, 1),
        List(4, 2, 1, 1)
      )

      When(s"Node is calculated")

      val node = CalculatorLive.calculatePath(triangle)

      Then(s"Value should be 5")

      node.value should be
      5
    }
  }
}
