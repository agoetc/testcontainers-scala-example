import com.dimafeng.testcontainers.{DockerComposeContainer, ExposedService}

import collection.mutable.Stack
import org.scalatest.*
import matchers.*
import freespec.*

import java.io.File

class Test extends AnyFreeSpec with BeforeAndAfterAll:

  val mysqlService: ExposedService = {
    val mysqlHost = "mysql_1"
    val mysqlPort = 3306
    ExposedService(mysqlHost, mysqlPort)
  }

  val container: DockerComposeContainer = DockerComposeContainer(
    new File(
      getClass.getClassLoader.getResource("docker-compose-it.yaml").getFile
    ),
    exposedServices = Seq(mysqlService)
  )

  override def beforeAll(): Unit =
    container.start()

  override def afterAll(): Unit =
    container.stop()

  "it" in
    assert(true)
