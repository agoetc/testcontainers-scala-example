import scalikejdbc.*

object ExampleTable:
  case class InsertParam(id: Option[Long], data: String)
  def insert(param: InsertParam)(implicit session: DBSession): Boolean =
    sql"insert into data (id, data) value (?, ?)"
      .bind(param.id, param.data)
      .execute
      .apply()
