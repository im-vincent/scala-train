package com.imooc.course04

/**
  * User: searainbow 
  */
object ApplyApp {
  def main(args: Array[String]): Unit = {
    //    for (i <- 1 to 10) {
    //      ApplyTest.incr
    //    }
    //
    //    println(ApplyTest.count) // 10 说明object本身就是一个单例对象

    val b = ApplyTest() // ==>Object.apply

    println("~~~~~~~~~~~~~~~~")
    val c = new ApplyTest()
    println(c)
    c()

    //    类名() ==> Object.apply
    //    对象() ==> Class.apply
  }
}

/**
  * 伴生类和伴生对象
  * 如果有一个class，还有一个与class同名的object
  * 那么就称这个object是class的伴生对象，class是object的伴生class
  */
class ApplyTest {
  def apply() = {
    println("class applytest apply...")
  }
}

object ApplyTest {
  println("object applytest enter...")

  var count = 0

  def incr = {
    count = count + 1
  }

  def apply() = {
    println("object applytest apply...")

    //  在object中apply中new class
    new ApplyTest
  }

  println("object applytest leave...")
}

