import scalikejdbc.{ConnectionPool, DB}

@main def main(): Unit =
  ConnectionPool.singleton(
    "jdbc:mysql://localhost/db",
    "root",
    "root"
  )

  val param = ExampleTable.InsertParam(
    None,
    "hoge"
  )

  DB autoCommit { implicit s =>
    ExampleTable.insert(param)
  }
