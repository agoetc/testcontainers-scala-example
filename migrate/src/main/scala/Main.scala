@main def main(): Unit =
  println("migrate start")
  MySQLSupport.execute()
  println("migrate end")
