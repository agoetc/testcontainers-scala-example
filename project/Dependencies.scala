import sbt._

object Dependencies {
  object MysqlConnector {
    private val version = "8.0.27"
    val mysqlConnector = "mysql" % "mysql-connector-java" % version
  }

  object Scalikejdbc {
    private val version = "4.0.0"
    val scalikejdbc = "org.scalikejdbc" %% "scalikejdbc" % version
  }

  object Logback {
    private val version = "1.2.9"
    val logback = "ch.qos.logback" % "logback-classic" % version
  }

  object ScalaTest {
    private val version = "3.2.10"
    val scalaTest = "org.scalatest" %% "scalatest" % version
  }

  object TestContainers {
    private val version = "1.16.2"
    lazy val testContainers = "org.testcontainers" % "testcontainers" % version
  }

  object ScalaTestContainers {
    private val version = "0.39.12"
    lazy val scalaTestContainers =
      "com.dimafeng" %% "testcontainers-scala" % version

  }

}
