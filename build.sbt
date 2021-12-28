val scala3Version = "3.1.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "test-containers-ci-example",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq(
      "org.scalikejdbc" %% "scalikejdbc" % "4.0.0",
      "org.scalatest" %% "scalatest" % "3.2.10" % Test,
      "org.testcontainers" % "testcontainers" % "1.16.2" % Test
    )
  )
