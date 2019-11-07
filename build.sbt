
val zio = "dev.zio" %% "zio" % "1.0.0-RC12-1"
val scalaTest = "org.scalatest" %% "scalatest" % "3.0.5" % Test

name := "minimum-triangle-path"

organization := "org.sigurdthor"
version := "1.0"

scalaVersion := "2.12.8"

libraryDependencies ++= Seq(
  zio,
  scalaTest
)
