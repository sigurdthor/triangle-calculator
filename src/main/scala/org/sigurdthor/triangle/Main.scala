package org.sigurdthor.triangle

import org.sigurdthor.triangle.CalculatorLive._
import org.sigurdthor.triangle.effects.ConsoleInputReader._
import zio._
import zio.console._

object Main extends App {

  def run(args: List[String]) = flow.fold(_ => 1, _ => 0)

  val flow: ZIO[Console, Throwable, Unit] =
    for {
      triangle <- readTriangle
      node <- Task.succeed(calculatePath(triangle))
      _ <- putStrLn(s"Minimal path is: ${node.path.mkString(" + ")} = ${node.value}")
    } yield ()
}
