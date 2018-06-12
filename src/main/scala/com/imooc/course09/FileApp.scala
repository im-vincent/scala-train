package com.imooc.course09

import scala.io.Source

/**
  * User: searainbow 
  */
object FileApp {
  def main(args: Array[String]): Unit = {
    lazy val file = Source.fromFile("hello.txt")(scala.io.Codec.UTF8)

    def readline() = {
      for (line <- file.getLines()) {
        println(line)
      }
    }

    def readChar() = {
      for (ele <- file) {
        println(ele)
      }

    }

    def readNet() = {
      val file = Source.fromURL("http://www.baidu.com")
      for (ele <- file.getLines()) {
        println(ele)
      }
    }

     readNet()
  }
}
