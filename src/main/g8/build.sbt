Revolver.settings

resolvers += "Typesafe Snapshots" at "http://repo.typesafe.com/typesafe/snapshots/"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.4" % "test" withSources() withJavadoc(),
  "org.scalacheck" %% "scalacheck" % "1.12.2" % "test" withSources() withJavadoc(),
  "org.scalaz" %% "scalaz-core" % "7.1.1"
)

initialCommands := "import $organization$.$name;format="camel,hyphen"$._"
