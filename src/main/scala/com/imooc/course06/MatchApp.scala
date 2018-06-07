package com.imooc.course06

import scala.util.Random

object MatchApp extends App {

  val names = Array("Akiho Yoshizawa", "YuiHatano", "Aoi Sola")

  val name = names(Random.nextInt(names.length))

  name match {
    case "Akiho Yoshizawa" => println("吉老师 。。。")
    case "YuiHatano" => println("波老师 。。。")
    case _ => println("不知道你们在说什么")
  }


  def judgeGrade(grade: String): Unit = {
    grade match {
      case "A" => println("Excellent ...")
      case "B" => println("Good ...")
      case "C" => println("Just so so ...")
      case _ => println("I will tell your parents")
    }
  }

  judgeGrade("A")
  judgeGrade("B")
  judgeGrade("C")
  judgeGrade("D")


  def judgeGrade(name: String, grade: String): Unit = {

    grade match {
      case "A" => println("Excellent ...")
      case "B" => println("Good ...")
      case "C" => println("Just so so ...")
      case _ if (name == "lisi") => println(name + "," + "you are a good boy, but ...")
      case _ => println("I will tell your parents ...")

    }
  }


  judgeGrade("lisi", "D")


  def greeting(array: Array[String]): Unit = {
    array match {
      case Array("zhangsan") => println("Hi : zhangsan")
      case Array(x, y) => println("Hi :" + x + "," + "Hi : " + y)
      case Array("zhangsan", _*) => println("Hi zhangsan and other friends")
      case _ => println("Hi, everybody ...")
    }
  }

  greeting(Array("zhangsan", "lisi"))

  def greeting(list: List[String]): Unit = {
    list match {
      case "zhangsan" :: Nil => println("Hi : zhangsan")
      case x :: y :: Nil => println("Hi:" + x + y)
      case "zhangsan" :: tail => println("Hi :zhangsan and other friends ...")
      case _ => println("Hi : everybody")
    }
  }


  greeting(List("pk", "zhangsan"))

  def matchType(obj: Any): Unit = {
    obj match {
      case x: Int => println("Int")
      case s: String => println("String")
      case m: Map[_, _] => m.foreach(println)
      case _ => println("other type")
    }
  }


  matchType(Map("pk" -> 18))
  matchType(6)
  matchType("hello world")

  class Person

  def caseclassMatch(person: Person): Unit = {
    person match {
      case CTO(name, floor) => println("CTO name :" + name + "floor :" + floor)
      case Employee(name, floor) => println("Employee name :" + name + "," + "floor :" + name)
      case _ => println("other")
    }
  }


  case class CTO(name: String, floor: String) extends Person

  case class Employee(name: String, floor: String) extends Person

  case class Other(name: String) extends Person


  caseclassMatch(CTO("pk", "22"))
  caseclassMatch(Employee("zhangsan", "33"))
  caseclassMatch(Other("lisi"))

  val grades: Map[String, String] = Map("pk" -> "A", "zhangsan" -> "C")

  def getGrade(name: String): Unit = {
    val grade = grades.get(name)

    grade match {
      case Some(grade) => println(name + ": your grade is :" + grade)
      case None => println("Sorry ...")
    }
  }

  getGrade("zhangsan")
  getGrade("lisi")
  getGrade("pk")

}
