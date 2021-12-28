import scalikejdbc.*

object MySQLSupport:
  def execute(): Unit =
    ConnectionPool.singleton(
      "jdbc:mysql://localhost/example",
      "root",
      "root"
    )

    DB autoCommit { implicit s =>
      createExampleTable()
    }

  private def createExampleTable()(implicit session: DBSession) =
    sql"create table example_table (id bigint, data varchar(10))".execute
      .apply()
