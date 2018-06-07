package com.imooc.course04

object SimpleObject {
  def main(args: Array[String]): Unit = {
    val person = new People()
    person.name = "Messi"
    println(person.name + ".." + person.age)
    println("invoke eat method: " + person.eat)

    person.printInfo()
    //  person.gender 这个是拿不到的
  }
}


class People {
  //  定义属性,_代表占位符只能使用var
  var name: String = _
  val age: Int = 10

  //  只能在class里能访问到
  private[this] val gender = "male"

  def printInfo(): Unit = {
    println("gender: " + gender)
  }

  //  定义方法
  def eat(): String = {
    name + " eat..."
  }
}

