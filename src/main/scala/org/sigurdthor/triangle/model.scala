package org.sigurdthor.triangle

object model {

  val EOF = "EOF"

  type Row = List[Int]
  type Triangle = List[Row]
  type Path = List[Int]

  case class Node(value: Int, path: Path)

  object Node {
     def empty = Node(0, List())
  }
}
