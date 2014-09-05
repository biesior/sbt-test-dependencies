name := "test-dependencies"

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.1"

lazy val root = (project in file("."))
  .enablePlugins(PlayJava)
  .aggregate(foo, bar, zee)
  .dependsOn(foo, bar, zee)

lazy val foo = (project in file("modules/foo"))
  .enablePlugins(PlayJava)
//  .dependsOn(bar, zee)

lazy val bar = (project in file("modules/bar"))
  .enablePlugins(PlayJava)
  .dependsOn(foo)

lazy val zee = (project in file("modules/zee"))
  .enablePlugins(PlayJava)
  .dependsOn(foo)

libraryDependencies ++= Seq(
  cache
)

exportJars := true
