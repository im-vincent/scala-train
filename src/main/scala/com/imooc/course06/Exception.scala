package com.imooc.course06

/**
  * User: searainbow
  */
object Exception {
  def main(args: Array[String]): Unit = {
    try {
      val i = 10 / 0
      println(i)
    } catch {
      case e: ArithmeticException => println("除数不能为0")
      case e: Exception => println(e.getMessage)
    } finally {
      // 释放资源,一定能执行

    }
  }
}
