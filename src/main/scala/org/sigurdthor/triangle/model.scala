package org.sigurdthor.triangle

object model {

  val EOF = "EOF"

  type Row = Array[Int]
  type Triangle = Array[Row]
  type Path = List[Int]

  case class Node(value: Int, path: Path)

  object Node {
     def empty = Node(0, List())
  }
}
