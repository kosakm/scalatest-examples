name := """scalatest-examples"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.10.4"

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.2.1" % "test"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
)