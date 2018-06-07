package com.imooc.course04

/**
  * User: searainbow
  */
object ConstructorApp {
  def main(args: Array[String]): Unit = {
    val person = new Person()
    println(person.name + " : " + person.age + " : " + person.school)

    val person2 = new Person("lisi", 10, "M")
    println(person2.name + " : " + person2.age + " : " + person2.school + " : " + person2.gender)

    val student = new Student("pk", 18,"Math")
    println(student.name + ":" + student.major)
  }

}

//主构造器
class Person(val name: String = "zhangsan", val age: Int = 30) {
  println("person Person enter...")
  val school = "ustc"
  var gender: String = _

  //  附属构造器
  def this(name: String, age: Int, gender: String) {
    this(name, age) // 附属构造器的第一行必须调用主构造器或者其他附属构造器
    this.gender = gender
  }

  println("person Person leave...")
}

// 如果是子类特有的参数一定要加上 var/val，不然外层无法访问
class Student(name: String, age: Int, var major: String) extends Person(name, age) {
  println("person Student enter..")
  override val school: String = "peking"

  println("person Student leave")
}
