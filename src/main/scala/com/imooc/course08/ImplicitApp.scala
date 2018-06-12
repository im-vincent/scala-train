package com.imooc.course08

import java.io.File

/**
  * 隐式转换
  * 功能：对某个类增加功能
  */
object ImplicitApp {

  //定义隐式转换函数
  implicit def manToSuperman(man: Man): SuperMan = {
    new SuperMan(name = man.name)
  }

  implicit def fileToRichFile(file: File): RichFile = {
    new RichFile(file)
  }

  def testParam(implicit name: String) {
    println(name + "``````````")
  }


  def main(args: Array[String]): Unit = {

    val man = new Man("pk")
    man.fly()


    //    val file = new File("/Users/rocky/imooc/hello.txt")
    //    val txt = file.read()
    //    println(txt)


    implicit val name: String = "implicit"

    testParam
    testParam("pk")


    //    错误写法
    //    implicit val s1 = "s1"
    //    implicit val s2 = "s2"
    //    testParam
  }

}


class Man(val name: String) {


  def eat(): Unit = {
    println(s"man[ $name ] eat ...")
  }


}

class SuperMan(val name: String) {


  def fly(): Unit = {
    println(s"man[ $name ] fly ...")
  }
}


class RichFile(val file: File) {
  def read() = {
    scala.io.Source.fromFile(file.getPath).mkString
  }

}
