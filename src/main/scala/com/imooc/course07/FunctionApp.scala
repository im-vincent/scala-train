package com.imooc.course07

object FunctionApp {
  def main(args: Array[String]): Unit = {
    def sum(a: Int, b: Int) = a + b

    println(sum(2, 3))

    def sum2(a: Int)(b: Int) = a + b

    println(sum2(2)(3))
  }

}
