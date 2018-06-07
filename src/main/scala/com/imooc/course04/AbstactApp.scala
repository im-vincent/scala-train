package com.imooc.course04

/**
  * User: searainbow 
  */
object AbstactApp {
  def main(args: Array[String]): Unit = {
   val student = new Student2()
    println(student.name)

  }

}

/**
  * 类的一个或者多个方法没有完整的实现（只有定义，没有实现）
  */
abstract class Person2 {
  def spark

  val name: String
  val age: Int
}

class Student2 extends Person2 {
  override def spark: Unit = {
    println("speak")
  }

  override val name: String = "wang"
  override val age: Int = 18
}