package org.sigurdthor.triangle

import org.sigurdthor.triangle.model.{Node, Row, Triangle}

trait TriangleCalculator {
  def calculatePath(triangle: Triangle): Node
}

object CalculatorLive extends TriangleCalculator {

  override def calculatePath(triangle: Triangle): Node = {

    val initial = Array.fill(triangle.last.length + 1)(Node.empty)

    val traverse: (Row, Array[Node]) => Array[Node] = (row, nodes) => {
      row.zip(nodes.zip(nodes.tail)).map {
        case (node, (left, right)) =>
          val next = if (left.value < right.value) left else right
          Node(
            node + next.value,
            node :: next.path)
      }
    }

    triangle.foldRight(initial)(traverse).head
  }
}