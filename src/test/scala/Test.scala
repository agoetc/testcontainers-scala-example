import com.dimafeng.testcontainers.{DockerComposeContainer, ExposedService}

import collection.mutable.Stack
import org.scalatest.*
import matchers.*
import freespec.*

import java.io.File

class Test extends AnyFreeSpec:

  val mysqlService: ExposedService = {
    val mysqlHost = "e2e-mysql_1"
    val mysqlPort = 3306
    ExposedService(mysqlHost, mysqlPort)
  }

  val container: DockerComposeContainer = DockerComposeContainer(
    new File("docker-compose-e2e.yaml"),
    exposedServices = Seq(mysqlService)
  )
