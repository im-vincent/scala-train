package com.imooc.course09

import java.sql.{Connection, DriverManager}


/**
  * User: searainbow 
  */
object MysqlApp {
  def main(args: Array[String]): Unit = {

    val url = "jdbc:mysql://10.117.130.173:3306/lalian"
    val username = "cdh"
    val password = "123456"

    var connection: Connection = null
    try {
      classOf[com.mysql.jdbc.Driver]

      connection = DriverManager.getConnection(url, username, password)
      val statment = connection.createStatement()
      val resultSet = statment.executeQuery("select sid from sc")
      while (resultSet.next()) {
        val sid = resultSet.getString("sid")

        println(s"$sid")

      }
    } catch {
      case e: Exception => e.printStackTrace()
    } finally {
      if (connection == null) {
        connection.close()
      }
    }
  }

}
