package com.imooc.course05

import scala.collection.mutable.ListBuffer

/**
  * list是有序的可以重复的
  * scala> val l = List(1,2,3,4)
  * l: List[Int] = List(1, 2, 3, 4)
  *
  * scala> l.head
  * res11: Int = 1
  *
  * scala> l.tail
  * res15: List[Int] = List(2, 3, 4)
  */
object ListApp {
  def main(args: Array[String]): Unit = {
    val l2 = 1 :: Nil // 1作为head，nil作为tail

    val l5 = ListBuffer[Int]()
    l5 += 2
    l5.isEmpty

  }
}
