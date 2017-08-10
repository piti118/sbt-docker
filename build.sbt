import sbt.Keys.libraryDependencies

enablePlugins(JavaAppPackaging)
enablePlugins(UniversalPlugin)

name := "ictskimmer"

version := "1.1"

scalacOptions in ThisBuild ++= Seq("-feature")

scalaVersion := "2.11.8"

resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"

//libraryDependencies += "org.json4s" % "json4s-native_2.11" % "3.5.0"

//libraryDependencies += "org.scalatra" %% "scalatra-json" % "2.2.0"

libraryDependencies += "org.json4s"   %% "json4s-jackson" % "3.5.0"

libraryDependencies += "com.github.pathikrit" % "better-files_2.11" % "2.17.1"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.1"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

libraryDependencies += "com.markatta" %% "timeforscala" % "1.4"

libraryDependencies += "org.scala-lang.modules" %% "scala-async" % "0.9.6"

libraryDependencies +=  "org.mongodb" %% "casbah" % "3.1.1"

libraryDependencies += "com.github.t3hnar" %% "scala-bcrypt" % "3.0"

libraryDependencies += "com.github.scopt" %% "scopt" % "3.5.0"

val ScalatraVersion = "2.5.+"

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % ScalatraVersion,
  "org.scalatra" %% "scalatra-scalate" % ScalatraVersion,
  "org.scalatra" %% "scalatra-specs2" % ScalatraVersion % "test",
  "ch.qos.logback" % "logback-classic" % "1.1.9",
  "org.eclipse.jetty" % "jetty-webapp" % "9.2.10.v20150310",
  "org.scalatra" %% "scalatra-json" % ScalatraVersion,
  "org.scalatra" %% "scalatra-scalatest" % ScalatraVersion % "test"
)

mainClass in assembly := Some("com.maonoi.eiis.ICTSkimmer")

mainClass in (Compile, run) := Some("com.maonoi.eiis.ICTSkimmer")

logBuffered in Test := false
