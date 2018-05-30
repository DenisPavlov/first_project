def processFile(filename: String, width: Int) = {

   def processLine(filename: String,
                  width: Int, line: String) = {

    if (line.length > width)
      println(filename + ": " + line.trim)
  }

  import scala.io.Source

  val source = Source.fromFile(filename)
  for (line <- source.getLines()) {
    processLine(filename, width, line)
  }
}