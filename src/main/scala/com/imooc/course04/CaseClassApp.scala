package com.imooc.course04

/**
  * User: searainbow 
  */
object CaseClassApp {
  def main(args: Array[String]): Unit = {

    println(Dog("wangcai").name)
  }
}

// case class 不需要new
case class Dog(name: String)
