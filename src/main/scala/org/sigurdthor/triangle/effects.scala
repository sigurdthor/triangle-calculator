package org.sigurdthor.triangle

import org.sigurdthor.triangle.model._
import zio.{IO, Task, UIO, ZIO}

import scala.io.Source.stdin

object effects {

  trait InputReader {
    def readTriangle: Task[Triangle]
  }

  object ConsoleInputReader extends InputReader {
    override def readTriangle: Task[Triangle] = IO.effect {
      stdin.getLines()
        .takeWhile(_ != EOF)
        .map(line => line.split(" ").map(_.toInt))
        .toArray
    }
  }

}
