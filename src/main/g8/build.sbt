Revolver.settings

resolvers += "Typesafe Snapshots" at "http://repo.typesafe.com/typesafe/snapshots/"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.10" % "2.0" % "test" withSources() withJavadoc(),
  "org.scalacheck" %% "scalacheck" % "1.10.0" % "test" withSources() withJavadoc(),
  "org.scalaz" % "scalaz-core_2.10" % "7.1.0-M3"
)

initialCommands := "import $organization$.$name;format="camel,hyphen"$._"
