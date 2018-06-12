package com.imooc.course07

object StringApp extends App {
  val name = "zhangsan"
  println(s"hello $name")

  val b =
    """
      |hello
      |zhangsan
      |这是一个多行字符串
    """.stripMargin

  println(b)
}
