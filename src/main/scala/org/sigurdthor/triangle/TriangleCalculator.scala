package org.sigurdthor.triangle

import org.sigurdthor.triangle.model.{Node, Triangle}
import scala.annotation.tailrec

trait TriangleCalculator {
  def calculatePath(triangle: Triangle): Node
}

object CalculatorLive extends TriangleCalculator {

  override def calculatePath(triangle: Triangle): Node = {
    val initial = List.fill(triangle.last.length + 1)(Node.empty)
    traverse(triangle.reverse, initial).head
  }

  @tailrec
  private def traverse(subTriangle: Triangle, nodes: List[Node]): List[Node] = subTriangle match {
    case Nil => nodes
    case _ :: tail =>
      val calculatedNodes = subTriangle.head.zip(nodes.zip(nodes.tail)).map {
        case (value, (left, right)) =>
          val next = if (left.value < right.value) left else right
          Node(
            value + next.value,
            value :: next.path)
      }
      traverse(tail, calculatedNodes)
  }
}