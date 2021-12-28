import Dependencies._

val scala3Version = "3.1.0"

lazy val root =
  project
    .in(file("."))
    .settings(
      name := "test-containers-ci-example",
      scalaVersion := scala3Version,
      libraryDependencies ++= Seq(
        MysqlConnector.mysqlConnector,
        Scalikejdbc.scalikejdbc,
        Logback.logback,
        ScalaTest.scalaTest % Test,
        TestContainers.testContainers % Test
      )
    )

lazy val migrate =
  project
    .in(file("migrate"))
    .settings(
      name := "migrate",
      scalaVersion := scala3Version,
      libraryDependencies ++= Seq(
        MysqlConnector.mysqlConnector,
        Scalikejdbc.scalikejdbc,
        Logback.logback
      )
    )
