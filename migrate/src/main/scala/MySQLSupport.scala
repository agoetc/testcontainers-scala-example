import scalikejdbc.*

object MySQLSupport:
  def execute(): Unit =
    ConnectionPool.singleton(
      "jdbc:mysql://localhost/db",
      "root",
      "root"
    )

    DB autoCommit { implicit s =>
      createExampleTable()
    }

  private def createExampleTable()(implicit session: DBSession) =
    sql"""
      create table data (
          id bigint auto_increment primary key,
          data varchar(10)
      )
      """.execute
      .apply()
