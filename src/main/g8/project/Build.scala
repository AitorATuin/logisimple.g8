import sbt._
import sbt.Keys._

object $name;format="Camel"$ extends Build {
  lazy val $name;format="lowercase"$ = Project(
    id = "$name;format="lowercase"$",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "$name$",
      organization := "$organization$",
      version := "$version$",
      scalaVersion := "$scalaVersion$"
      // More settings here
    )
  )
}
