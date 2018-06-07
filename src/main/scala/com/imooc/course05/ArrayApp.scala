package com.imooc.course05

import scala.collection.mutable.ArrayBuffer

/**
  ** Array 中的元素值可变，List和Tuple中的元素值不可变
  */
object ArrayApp {
  def main(args: Array[String]): Unit = {
    //    创建空数组
    val a = new Array[String](5)

    val b = Array("hadoop", "spark")
    //    数组转字符串
    println(b.mkString("<", ",", ">"))

    //    变长数组
    val c = ArrayBuffer[Int]()
    c += 1
    c += 2
    c += (3, 4, 5)
    //    加一个数组
    c ++= Array(6, 7, 8)
    c.insert(0, 0)
    c.remove(1)
    //    从末尾删除
    c.trimEnd(2)

    c.toArray

    for (ele <- c.reverse) {
      println(ele)
    }
    println(c)
  }
}

