package com.imooc.course05

import scala.collection.mutable

/**
  * User: searainbow 
  */
object MapApp {
  def main(args: Array[String]): Unit = {
    val a = Map("zhangsan" -> 30, "lisi" -> 13)
    println(a("zhangsan"))

    val b = mutable.Map("zhangsan" -> 30, "lisi" -> 13)
    b("lisi") = 99
    println(b.getOrElse("lisi1", 9))

    val c = mutable.HashMap[String, Int]()

    for ((key, value) <- b) {
      println(key + ":" + value)
    }
  }

}
