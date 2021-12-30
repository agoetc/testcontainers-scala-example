import Dependencies._

val scala3Version = "3.1.0"

Docker / packageName := "app"

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
        ScalaTestContainers.scalaTestContainers % Test
      )
    )
    .settings(
      dockerBaseImage := "library/eclipse-temurin:17.0.1_12-jre",
      dockerUpdateLatest := true
    )
    .enablePlugins(DockerPlugin, JavaAppPackaging, AshScriptPlugin)

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
