package chapter3

import scala.io.Source

object Ex4 {
  def main(args: Array[String]) {
    def countchars2(args: Array[String]) {
      def widthOfLength(s: String) = s.length.toString.length

      if (args.length > 0) {
        val lines = Source.fromFile(args(0)).getLines().toList
        var maxWidth = 0
        for (line <- lines)
          maxWidth = maxWidth.max(widthOfLength(line))
        println("maxWidth [" + (maxWidth) + "]")
      }
    }
    countchars2(Array("/Users/user/Desktop/projects/first_project/src/main/scala/chapter3/countchars1.scala"))
  }
}
